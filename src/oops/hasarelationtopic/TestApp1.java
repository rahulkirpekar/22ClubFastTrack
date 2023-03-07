package oops.hasarelationtopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Address	rahulEmpAddress = new Address("234877654", "1", "Maninagar", "Ahm", "Guj", "IND", "313245");
		
		Employee rahulEmp = new Employee(1, "Rahul Kirpekar", 21345, rahulEmpAddress);
		
		rahulEmp.disp();
		
		
		
	}
}
