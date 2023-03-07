package innerclasstopic;

public class TestApp2 
{
	private int no =200;
	
	public void display() 
	{
		class LocalInner
		{
			void msg() 
			{
				System.out.println("LocalInner --- msg()---No : " + no);
			}
		}
		LocalInner l = new LocalInner();
		l.msg();
	}
	public static void main(String[] args) 
	{
		TestApp2  obj = new TestApp2();
		
		obj.display();
	}
}
