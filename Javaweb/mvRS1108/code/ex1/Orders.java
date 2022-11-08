
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;





@Path("/orders")
public class Orders {
	List<String>  data;
	public Orders() {
		data=new ArrayList<>();
		data.add("Apple");
		data.add("Lemon");
		data.add("Cherry");
	}

    @GET
    public String getOrders() {
        return "returning all orders";
    }

    @GET
    @Path("/{orderId}")
    public String getOrderById(
            @PathParam("orderId") int Id) {
        return "returning order with id " + Id;
    }

    @GET
    @Path("/{orderId}/items")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getOrderItemsById(@PathParam("orderId") String orderId) {
        return data ;
    }


}
