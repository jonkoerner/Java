import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	private static int totalAccountsCreated;
	private static double totalBankMoney;
	private static Random rand = new Random();
	
	public BankAccount(double checking, double saving){
		accountNumber = this.makeAccountNumber();
        checkingBalance = checking;
        savingsBalance = saving;
        setTotalBankMoney(getTotalBankMoney() + (checkingBalance+savingsBalance));
        setTotalAccountsCreated(getTotalAccountsCreated() + 1);	
        }
	private String randomten() {
		return Integer.toString(rand.nextInt(1000000000)+1000000000);
	}
	public String makeAccountNumber() {
		return (this.accountNumber = randomten());
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public static int getTotalAccountsCreated() {
		return totalAccountsCreated;
	}
	public static void setTotalAccountsCreated(int totalAccountsCreated) {
		BankAccount.totalAccountsCreated = totalAccountsCreated;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public static double getTotalBankMoney() {
		return totalBankMoney;
	}
	public static void setTotalBankMoney(double totalBankMoney) {
		BankAccount.totalBankMoney = totalBankMoney;
	}
	public void deposit(double amount) {
		System.out.println(this.getCheckingBalance());
		this.setCheckingBalance(this.getCheckingBalance()+amount);
		System.out.println(this.getCheckingBalance());
	}
	public void withdraw(double amount) {
		System.out.println(this.getCheckingBalance());
		this.setCheckingBalance(this.getCheckingBalance()-amount);
		System.out.println(this.getCheckingBalance());
	}

	
	
//	private int makeAccountNumber() {
//		Random newaccount= rand;
//		String accountNumber = (newaccount);
//		}
//	}
//	
//	public BankAccount(double checking, double saving){
//		accountNumber = BankAcount.
//		
//	}
	

}

