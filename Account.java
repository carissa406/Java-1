public class Main {

	public static void main(String[] args) {
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getMonthlyInterest());
		System.out.println(myAccount.getDateCreated());
		
		CheckingAccount myCheckingAccount = new CheckingAccount(1123, 100);
		SavingsAccount mySavingsAccount = new SavingsAccount(1124, 100);
		
		System.out.println(myAccount.toString());
		System.out.println(myCheckingAccount.toString());
		System.out.println(mySavingsAccount.toString());
	}

	public static class Account {
		
		private int id=0;
		private double balance=0;
		private double annualInterestRate=0;
		
		private java.util.Date dateCreated = new java.util.Date(System.currentTimeMillis());
		
		public Account() {

		}
		
		public Account(int id, double balance) {
			this.id=id;
			this.balance=balance;
		}
	
		public int getId() {
			return id;
		}
	
		public void setId(int id) {
			this.id = id;
		}
	
		public double getBalance() {
			return balance;
		}
	
		public void setBalance(double balance) {
			this.balance = balance;
		}
	
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}
	
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}
	
		public java.util.Date getDateCreated() {
			return dateCreated;
		}
		
		public double getMonthlyInterestRate() {
			return (annualInterestRate/100)/12;
		}
		
		public double getMonthlyInterest() {
			return balance * getMonthlyInterestRate();
		}
		
		public void deposit(double amount) {
			this.balance+=amount;
		}
		
		public void withdraw(double amount) {
			this.balance-=amount;
		}
	}
	
	public static class CheckingAccount extends Account{
		
		public CheckingAccount() {
		
		}
		
		public CheckingAccount(int id, double balance) {
			setId(id);
			setBalance(balance);
		}
		
		public void withdraw(double amount) {
			if(getBalance()-amount >= -500) {
				setBalance(getBalance()-amount);
			}
		}
	}
	
	public static class SavingsAccount extends Account{
		public SavingsAccount() {
			
		}
		
		public SavingsAccount(int id, double balance) {
			setId(id);
			setBalance(balance);
		}
		public void withdraw(double amount) {
			if(getBalance()-amount >= 0) {
				setBalance(getBalance()-amount);
			}
		}
	}
}
