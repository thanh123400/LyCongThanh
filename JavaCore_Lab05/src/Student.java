
public class Student extends Person{
	
	private String Program;
	private int Year;
	private Double Fee;
	
	public Student()
	{
		
	}
	
	public Student(String Name, String Address, String Program, int Year, Double Fee)
	{
		this.Name = Name;
		this.Address = Address;
		this.Program = Program;
		this.Year = Year;
		this.Fee = Fee;
	}

	public String getProgram() {
		return Program;
	}

	public void setProgram(String program) {
		Program = program;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public Double getFee() {
		return Fee;
	}

	public void setFee(Double fee) {
		Fee = fee;
	}
	
	

}
