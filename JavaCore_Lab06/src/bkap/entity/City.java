package bkap.entity;

import java.util.Scanner;


public class City implements ICity{
	String Id;
	String Name; 
	String Province; 
	double Area; 
	int Population; 
	double Consistence;
	Boolean Status;
	
	public City()
	{
		
	}
	
	public City(String id, String name, String province, double area, int population, double consistence,
			Boolean status) {
		Id = id;
		Name = name;
		Province = province;
		Area = area;
		Population = population;
		Consistence = consistence;
		Status = status;
	}

	@Override
	public void InputData() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			Id = sc.nextLine();
			if(Id.length() != 4 || Id.charAt(0) != 'C')
			{
				throw new RuntimeException();
			}
		} catch (Exception e) {
			Id = "errol";
		}
		
		try {
			Name = sc.nextLine();
			if((Name.length() <= 60 && Name.length() >=10) || check(Name))
			{
				throw new RuntimeException();
			}
		} catch (Exception e) {
			Name = "errol";
		}
		
		try {
			Province = sc.nextLine();
			if(Province == "")
			{
				throw new RuntimeException();
			}
		} catch (Exception e) {
			Province = "Trung Uong";
		}
		
		try {
			Area = Integer.parseInt(sc.nextLine());
			if(Area < 0)
			{
				throw new RuntimeException();
			}
		} catch (Exception e) {
			Area = 0;
		}
		
		try {
			Population = Integer.parseInt(sc.nextLine());
			if(Population < 0)
			{
				throw new RuntimeException();
			}
		} catch (Exception e) {
			Population = 0;
		}
		
		try {
			Status = Boolean.parseBoolean(sc.nextLine());
		} catch (Exception e) {
			Status = false;
		}
		
		
	}

	@Override
	public void DisplayData() {
		System.out.printf("CityId: %c/tCityName: %c/tProvince: %c", this.Id, this.Name, this.Province);
		System.out.printf("Area: %f/tPopulation: %d/tConsistence: %f/tStatus: %b", this.Area, this.Population, this.Consistence, this.Status);
	}

	public String getId() {
		return Id;
	}



	public void setId(String id) {
		Id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getProvince() {
		return Province;
	}



	public void setProvince(String province) {
		Province = province;
	}



	public double getArea() {
		return Area;
	}



	public void setArea(double area) {
		Area = area;
	}



	public int getPopulation() {
		return Population;
	}



	public void setPopulation(int population) {
		Population = population;
	}



	public double getConsistence() {
		return Consistence;
	}



	public void setConsistence(double consistence) {
		Consistence = consistence;
	}



	public Boolean getStatus() {
		return Status;
	}



	public void setStatus(Boolean status) {
		Status = status;
	}

	public boolean check(String a)
	{
		char ch;
		int n = a.length();
		for(int i=0; i<n; i++)
		{
			ch = a.charAt(i);
			if(Character.isLowerCase(ch))
			{
				return false;
			}
		}
		return true;
	}
	
	public void calConsistence()
	{
		Consistence = ((double)Population) / Area;
	}

}
