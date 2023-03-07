package innerclasstopic;

public class OuterClass 
{
	private static int no = 200;
	// "Nested Class"
	static class InnerClass
	{
		void msg() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		OuterClass.InnerClass in = new OuterClass.InnerClass();
		
		in.msg();
	}
}
