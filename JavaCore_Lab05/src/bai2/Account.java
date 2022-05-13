package bai2;

public class Account {
	protected String AccountNo;
	protected String Name;
	protected int Money;

	public Account() {

	}

	public Account(String accountNo, String name, int money) {
		AccountNo = accountNo;
		Name = name;
		Money = money;
	}

	public String getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(String accountNo) {
		AccountNo = accountNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMoney() {
		return Money;
	}

	public void setMoney(int money) {
		Money = money;
	}

}
