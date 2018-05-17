
public class BankAccountTests {

	public static void main(String[] args) {
		BankAccount jon = new BankAccount(50023.23 , 400.00);
		System.out.println("Account # "+ jon.getAccountNumber());
		System.out.println("Savings balance:"+ jon.getSavingsBalance());
		System.out.println("Checking balance:" + jon.getCheckingBalance());
		jon.deposit(200);
	}
}
