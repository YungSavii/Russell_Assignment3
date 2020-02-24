package BankInfo;

public class SavingsAccount {
	static private double annualInterestRate;
	private double savingBalance;
	public SavingsAccount() {
		
	}
	public SavingsAccount(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	public double getSavingBalance() {
		return this.savingBalance;
	}
	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
    }
	public void calculateMonthlyInterest() {
		double monthlyl = (double)(this.savingBalance * annualInterestRate / 12);
		this.savingBalance += monthlyl;
	}
	public static void main(String[] args) {
		SavingsAccount saver1, saver2;
        saver1 = new SavingsAccount (2000.0);
        saver2 = new SavingsAccount (3000.0);

        SavingsAccount.modifyInterestRate(0.04);
        for (int a = 0; a < 12; a++) {
        	saver1.calculateMonthlyInterest();
        	System.out.println("Month" + (a + 1) + " : " + String.format("%.2f", saver1.getSavingBalance()));
        }
        for (int a = 0; a < 12; a++) {
        	saver2.calculateMonthlyInterest();
        	System.out.println("Month" + (a + 1) + " : " + String.format("%.2f", saver2.getSavingBalance()));
        }
        SavingsAccount.modifyInterestRate(0.05);
        for (int a = 0; a < 12; a++) {
        	saver1.calculateMonthlyInterest();
        	System.out.println("Month" + (a + 1) + " : " + String.format("%.2f", saver1.getSavingBalance()));
        }
        for (int a = 0; a < 12; a++) {
        	saver2.calculateMonthlyInterest();
        	System.out.println("Month" + (a + 1) + " : " + String.format("%.2f",saver2.getSavingBalance()));
        }
	}
}
