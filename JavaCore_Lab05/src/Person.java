
public class Person {
	protected String Name;
	protected String Address;
	
	public Person()
	{
		
	}
	
	public Person(String Name, String Address)
	{
		this.Address = Address;
		this.Name = Name;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
}
