package innerclasstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Anonymous InnerClasss --- interface
		Person person = new Person() 
		{
			@Override
			public void eat() 
			{
				System.out.println("Person --eat()---"+this);
			}
		}; 
		
		person.eat();
	}
}
