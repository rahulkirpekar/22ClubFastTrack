package stringtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String name1 = "rahul";
		String name2 = "rahul";
		String name3 = "kirpekar";
		String name4 = name1;
		String name5 = name1 + " " +name3;

		System.out.println("name1.equals(name2) - " + name1.equals(name2));
		System.out.println("name1.equals(name3) - " + name1.equals(name3));

		System.out.println("name1==name2 - " + (name1==name2));
		System.out.println("name1==name3 - " + (name1==name3));
		
		
	}
}
