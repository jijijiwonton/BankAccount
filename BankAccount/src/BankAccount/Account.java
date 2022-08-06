package BankAccount;

import java.util.Scanner;

import Admin.Administrator;

public class Account {
	
	Scanner input = new Scanner(System.in);
	
	// Define a global variable
	private String number;
	private String userName;
	private String userPassword;
	private double balance;
	
	Administrator admin = new Administrator();
	
	// Create an overloaded constructor for general case
	public Account(String userName, String userPassword, double balance) {
		this.number = admin.uniqueNumberGenerator();
		setUserName(userName);
		setUserPassword(userPassword);
		setBalance(balance);
	}
	
	// Create an overloaded constructor for specific case
	public Account(Account account) {
		this.number = account.getNumber();
		setUserName(account.getNumber());
		setUserPassword(account.userPassword);
		setBalance(account.balance);
	}

	/**
	 * Get user account number
	 * @return account number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Get user name
	 * @return user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Set user name
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/**
	 * Get user password
	 * @return user password
	 */
	public String getUserPassword() {
		return userPassword;
	}
	
	/**
	 * Set user password
	 * @param userPassword
	 */
	public void setUserPassword(String userPassword) {
		int validLength = 8;
		if(userPassword.contains(getUserName())) {
			throw new Error(InternalSystem.PASSWORD_USER_NAME_CANNOT_INCLUDE);
		}
		if(userPassword.length() < validLength) {
			throw new Error("Password " + InternalSystem.LENGTH_ERROR + validLength);
		} 
		
		// Confirm user password
		System.out.print("Please enter your password again: ");
		String confirm = input.next();
		
		boolean isMatched = userPassword.equals(confirm) ? true : false;
		
		if(isMatched) {
			this.userPassword = userPassword;
		} else {
			throw new Error("Confirmed password doesnt match");
		}
	}
	
	/**
	 * Get user unique ID
	 * @return
	 */
	public String getUserId() {
		return userName + number;
	}
	
	/**
	 * Get user current balance
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	/**
	 * Set user balance
	 * @param balance
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Get user account details
	 * @return account details
	 */
	public String getAccountDetails() {
		return "User name: " + getUserName() + "\n" +
	           "Account number: " + getNumber() + "\n" +
			   "User ID: " + getUserId() + "\n" +
	           "Current balance: " + getBalance();
	} 
}
