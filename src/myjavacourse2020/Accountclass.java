package myjavacourse2020;

public class Accountclass {

	private String accountName;
	private int accountNumber;
	private double accountDeposit;
	private double accountBalance;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountDeposit() {
		
		return accountDeposit;
}
	public void setAccountDeposit(double accountDeposit) {
		if(accountDeposit<0) {
			System.err.println("pls enter postive Number");
		}else {
		this.accountDeposit = accountDeposit;
	   }
	}
	public double getAccountBalance() {
		return accountBalance + this.accountDeposit;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Accountclass mcc = new Accountclass();
mcc.setAccountName("kalo");
mcc.setAccountNumber(1234567890);
mcc.setAccountDeposit(-579988.89);
mcc.setAccountBalance(54464.56);
System.out.println("Account name:" + mcc.getAccountName());
System.out.println("Account number:" + mcc.getAccountNumber());
System.out.println("Account deposit:" + mcc.getAccountDeposit());
System.out.println("Account balance:" + mcc.getAccountBalance());


}



}