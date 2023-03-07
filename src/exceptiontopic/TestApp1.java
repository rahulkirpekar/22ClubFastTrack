package exceptiontopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Statement---1");
		System.out.println("Statement---2");
		System.out.println("Statement---3");
		System.out.println("Statement---4");
		System.out.println("Statement---5");
		
		try 
		{
			try 
			{
				System.out.println(10/2);
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			try {
				
				String name =null;
				System.out.println(name.length());
			} catch (Exception e) 
			{
				e.printStackTrace();
			}

			try 
			{
				
				int a [] = new int[5];
				a[5]=100;
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		} catch (Exception e) 
		{
			System.out.println("ArrayIndexOutOfBoundsException Handled by Catch block");
			e.printStackTrace();
		}
		
		
		System.out.println("Statement---6");
		System.out.println("Statement---7");
		System.out.println("Statement---8");
		System.out.println("Statement---9");
		System.out.println("Statement---10");
	}
}
