package BankAccount;

import Admin.Administrator;

public class Account {
	
	// Define a global variable
	private String number;
	private String userName;
	private String userPassword;
	private double balance;
	
	// Create an overloaded constructor for general case
	public Account(String number, String userName, String userPassword, double balance) {
		setNumber(number);
		setUserName(userName);
		setUserPassword(userPassword);
		setBalance(balance);
	}
	
	// Create an overloaded constructor for specific case
	public Account(Account account) {
		setNumber(account.getNumber());
		setUserName(account.getUserName());
		setUserPassword(account.getUserPassword());
		setBalance(account.getBalance());
	}

	/**
	 * Get user account number
	 * @return account number
	 */
	public String getNumber() {
		return number;
	}
	
	/**
	 * Set user account number
	 * @param unique number
	 */
	public void setNumber(String number) {
		this.number = number;
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
		} this.userPassword = userPassword;
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
	 * @return
	 */
	public String getAccountDetails() {
		return "User name: " + getUserName() + "\n" +
	           "Account number: " + getNumber() + "\n" +
			   "User ID: " + getUserId() + "\n" +
	           "Current balance: " + getBalance();
	} 
}
