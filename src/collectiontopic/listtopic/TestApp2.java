package collectiontopic.listtopic;

import java.util.ArrayList;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> mainList = new ArrayList<String>();
		mainList.add("rahul");//0
		mainList.add("ankur");//1
		mainList.add("brijesh");//2
		mainList.add("sagar");//3
		mainList.add("abhishekh");//4

		ArrayList<String> subList = new ArrayList<String>();
		subList.add("paresh");
		subList.add("kiran");
		subList.add("sagar");//3
		
		
//		mainList.addAll(subList);
//		System.out.println("mainList - " + mainList);
//		mainList.addAll(1, subList);
//		System.out.println("mainList - " + mainList);

//		mainList.retainAll(subList);
//		System.out.println(mainList);
//		System.out.println(subList);

//		mainList.set(1, "Ankur Barot");
//		System.out.println(mainList);
		
//		mainList.remove(1);
		mainList.remove("ankur");
		System.out.println(mainList);

	}
}
