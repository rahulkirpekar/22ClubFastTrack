package stringtopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		String name1 = new String("rahul");
		String name2 = new String("rahul");
		String name3 = new String("kirpekar");
		String name4 = name1 + " "+ name3;// "rahul kirpekar"
		String name5 = "rahul kirpekar";// "rahul kirpekar"
		
		System.out.println(name5.equals(name4));
		System.out.println((name5==name4));
		
		
	}
}
