import java.util.Date;

public class Account {

	//Variables for Account
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	//No-arg Constructor for Account
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	//Creates a constructor of account with specified id and intial balance
	Account(int newId, double newBalance){
		id = newId;
		balance = newBalance;
	}
	Account(int newId, double newBalance, double newAnnualInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		
	}
	
	//Accessor and mutator methods for id, balance, and annualInterestRate
	public int getId(){
		return id;
	}
	public double getbalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	public void setId(int newId){
		id = newId;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	//accessor method for dateCreated
	public void setDateCreated(Date newDateCreated){
		dateCreated = newDateCreated;
	}
	
	//Method for getMonthlyInterestRate
	double getMonthlyInterestRate(){
		return annualInterestRate/12;		
	}
	//Method for Withdraw
	double withdraw(double amount){
		return balance -= amount;
	}
	//Method for deposit
	double deposit(double amount){
		return balance += amount;
	}

}

