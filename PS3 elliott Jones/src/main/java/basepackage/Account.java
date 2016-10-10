package basepackage;
import java.util.Date;


public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date(0);

	public Account() {

	}

	public Account(int id, int initialbalance) {
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

	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	public void withdraw(double AmountWithdrawn) throws
				InsufficientFundsException
{
		if(AmountWithdrawn <= balance)
		{
			balance -= AmountWithdrawn;
		}
		else
		{
			double needs = AmountWithdrawn - balance;
			throw new InsufficientFundsException(needs);
		}	
}

	public void deposit(double AmountDeposited) {
		this.balance = balance - AmountDeposited;
	}

}