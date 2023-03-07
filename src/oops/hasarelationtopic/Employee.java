package oops.hasarelationtopic;

public class Employee 
{
	private int id;
	private String name;
	private int salary;
	private Address address = null;
	public Employee() 
	{
	}
	public Employee(int id, String name, int salary, Address address) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void disp() 
	{
		Address a = getAddress();
		System.out.println(getId() + " " +getName() + " " + getSalary() + " " +a.getBno() + " " +a.getAreaName() + " " + a.getCityName() + " " +a.getStateName() + " " +a.getCuntryName() + " " +a.getPincode());
	}
}
