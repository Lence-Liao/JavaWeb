

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class FirstRestApp extends Application
{
    @Override
    public Set<Class<?>> getClasses() {
        return new HashSet(Arrays.asList(CoffeeRestService.class,CustomerRestService.class,StudentRestService.class));
    }
}