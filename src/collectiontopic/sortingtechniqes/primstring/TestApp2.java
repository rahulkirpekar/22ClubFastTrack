package collectiontopic.sortingtechniqes.primstring;
import java.util.ArrayList;
import java.util.Collections;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("rakesh");
		list.add("ankur");
		list.add("chetan");
		list.add("brijesh");
		list.add("ketan");
		
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		System.out.println("After Sorting : ");
		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i));
		}
	} 
}