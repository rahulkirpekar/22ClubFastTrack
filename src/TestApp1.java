
public class TestApp1 
{
	public static void main(String[] args) 
	{
		EmployeeBean e = new EmployeeBean();
		e.setId(1);
		e.setName("rahul");
		e.setSalary(1213);
		e.setDsgn("SE");
		
		
		System.out.println(e.getRno() + " " +e.getName() + " " +e.getSalary() + " " +e.getDsgn());
		
		
		// 1) By Constructor Way
		// 2) By scan---setters and dis---getters way
	}
}
