package oops.hasarelationtopic;

public class Address 
{
	private String contactNo;
	private String bno;
	private String areaName;
	private String cityName;
	private String stateName;
	private String cuntryName;
	private String pincode;
	public Address() 
	{
	}
	public Address(String contactNo, String bno, String areaName, String cityName, String stateName, String cuntryName,
			String pincode) 
	{
		this.contactNo = contactNo;
		this.bno = bno;
		this.areaName = areaName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.cuntryName = cuntryName;
		this.pincode = pincode;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getBno() {
		return bno;
	}
	public void setBno(String bno) {
		this.bno = bno;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCuntryName() {
		return cuntryName;
	}
	public void setCuntryName(String cuntryName) {
		this.cuntryName = cuntryName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
