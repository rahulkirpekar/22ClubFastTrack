package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer,String> mapObj = new TreeMap<Integer,String>();
		mapObj.put(5, "rakesh");//4
		mapObj.put(1, "rahul");//0---Entry
		mapObj.put(3, "ankur");//2
		mapObj.put(4, "brijesh");//3
		mapObj.put(2, "ramesh");//1
		
		for( Map.Entry<Integer, String>	 e	: mapObj.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}