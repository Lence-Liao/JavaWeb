package javaproj;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer>  data=new ArrayList<>(List.of(1,3,5,7,9));
        List<Integer>  data2=new ArrayList<>(Arrays.asList(2,4,6,8,10));
        Consumer<Integer> cs=new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {	
				if(t%2==0)
					return;
				System.out.println(t);
			}        	
        };
        //data.forEach(cs);
        data2.forEach(cs);
        Predicate<Integer> pd=new  Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t>5;
			}        	
        };
       //data.removeIf(t-> t%2==0);
        //data.forEach(System.out::println);
        UnaryOperator<Integer> uo=new UnaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				
				return t;
			}
			        	
        };
        //data2.replaceAll(t->t*2);
        //data2.forEach(System.out::println);
	}
}
