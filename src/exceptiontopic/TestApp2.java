package exceptiontopic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println(10/0);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}finally 
		{
			System.out.println("I am Finally Block");
		}
		System.out.println("After catch block");
	}
}
