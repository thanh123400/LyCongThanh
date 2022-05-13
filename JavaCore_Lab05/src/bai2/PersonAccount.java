package bai2;

public class PersonAccount extends Account{
	
	private int Fee;
	
	public PersonAccount() {
		
	}

	public PersonAccount(int Fee, String AccountNo, String Name, int Money) {
		this.Money = Money;
		this.Name = Name;
		this.AccountNo = AccountNo;
		this.Fee = Fee;
	}

	public int getFee() {
		return Fee;
	}

	public void setFee(int fee) {
		Fee = fee;
	}
	
	public void withDraw(int money)
	{
		this.Money -=  money;
	}
	
	public void deposite(PersonAccount a, PersonAccount b, int money)
	{
		a.Money -= money + Fee;
		b.Money += money;
	}
	

}
