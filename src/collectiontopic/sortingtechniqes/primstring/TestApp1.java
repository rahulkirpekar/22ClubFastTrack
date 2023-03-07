package collectiontopic.sortingtechniqes.primstring;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		list.add(675);
		list.add(23);
		list.add(87);
		list.add(7);
		list.add(1221);
		list.add(87);
		
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
