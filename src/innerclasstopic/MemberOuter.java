package innerclasstopic;

public class MemberOuter 
{
	private int no = 100;

	// Member InnerClass
	class InnerClass
	{
		void msg() 
		{
			System.out.println("No : " + no);
		}	
	}
	public static void main(String[] args) 
	{
		MemberOuter outer = new MemberOuter();
		
		MemberOuter.InnerClass inobj = 	outer. new InnerClass();

		inobj.msg();
	}
}
