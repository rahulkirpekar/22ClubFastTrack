package streampapitopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(1, "KeyBoad", 10000);
		Product p2 = new Product(2, "Mouse", 20000);
		Product p3 = new Product(3, "TV", 30000);
		Product p4 = new Product(4, "Monitor", 58000);
		Product p5 = new Product(5, "KeySpeaker", 50000);
		
		ArrayList<Product> list = new ArrayList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		
//		 Stream.iterate(1, element->element+1)  
//	        .filter(element->element%5==0)  
//	        .limit(5)  
//	        .forEach(System.out::println);  
		
		
		Stream<Product> stream = 	list.stream();
		
		long totalCount = stream.filter(product->product.getPrice()>30000).count();
		
		System.out.println("totalCount : " + totalCount);
//		int grandTotalPrice = stream.map(product->product.getPrice()).reduce(0, (Integer::sum));
		
//		System.out.println("grandTotalPrice : " + grandTotalPrice);
		
		
		// Predicate----test-----> p->p.getPrice() < 25000
		
//		List<Product> listProducts =  stream.filter(p->p.getPrice() < 25000).collect(Collectors.toList());
		
//		stream.filter(p->p.getPrice() < 25000).forEach(product->product.disp());
		
//		System.out.println("listProducts.size() - " + listProducts.size()); 
		
		
//		for (int i = 0; i < list.size(); i++) 
//		{
//			Product p = list.get(i);
//			if (p.getPrice()<25000) 
//			{
//				p.disp();
//			} 
//		} 
	}
}
