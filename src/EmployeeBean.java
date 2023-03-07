
// POJO - Plain Old Java Object
public class EmployeeBean 
{
	private int id;
	private String name;
	private int salary;
	private String dsgn;

	// setters methods / Mutators
	public void setId(int id) 
	{
		this.id=id;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setSalary(int salary) 
	{
		this.salary=salary;
	}
	public void setDsgn(String dsgn) 
	{
		this.dsgn=dsgn;
	}
	// getters methods / Accessors

	public int getRno()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public String getDsgn()
	{
		return dsgn;
	}
}







