package Admin;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import BankAccount.Account;
import BankAccount.InternalSystem;

public class Administrator implements Confidential {
	
	Scanner input = new Scanner(System.in);

	@Override
	/**
	 * Determine the user exists or not
	 * @param Account object
	 * @return If the user exists true, otherwise false
	 */
	public boolean isUserExist(Account account) {
		ArrayList<Account> lists = accessAccount(new Administrator());
		for(Account a: lists) {
			if(a.equals(account)) {
				return true;
			}
		} throw new IllegalArgumentException(InternalSystem.NO_USER_EXIST);
	}

	@Override
	/**
	 * Generate an unique account number
	 * @return an unique account number
	 */
	public String uniqueNumberGenerator() {
		Random r = new Random();
		String n = null;
		boolean isNumberUnique = false;
		while(!isNumberUnique) {
			n = String.valueOf(Math.abs(r.nextInt()));
			isNumberUnique = isNumberUnique(n);
		} return n;
	}

	@Override
	/**
	 * A method to verify an unique number
	 * @param random number
	 * @return If the number is unique true, otherwise false
	 */
	public boolean isNumberUnique(String number) {
		ArrayList<Account> lists = accessAccount(new Administrator());
		for(Account a: lists) {
			if(a.getNumber().equals(number)) {
				return false;
			}
		} return true;
	}

	@Override
	/**
	 * @param Object
	 * @return All registered account info
	 */
	public ArrayList<Account> accessAccount(Object obj) {
		if(obj instanceof Administrator) {
			return manageAccount;
		} else {
			throw new IllegalArgumentException(InternalSystem.ACCESS_DECLINED);
		}
	}

	@Override
	/**
	 * @param Account object and money
	 * @return If the money's of the user is sufficient true, otherwise false
	 */
	public boolean isBalanceSufficient(Account account, double money) {
		if(money > account.getBalance()) {
			throw new IllegalArgumentException(InternalSystem.BALANCE_INSUFFICIENT);
		} else {
			return true;
		}
	}
	
	/**
	 * A private helper method to add user
	 * @param account
	 */
	private void _addUser(Account account) {
		accessAccount(new Administrator()).add(account);
		if(isUserExist(account)) {
			System.out.println(account.getUserId() + InternalSystem.COMPLETED);
		}
		
	}
	
	/**
	 * Add user account using a private helper method
	 * @param account
	 */
	public void addUser(Account account) {
		_addUser(account);
	}
	
	/**
	 * Confirm all available funds in the bank
	 * @return all user account's balance
	 */
	public double totalFunds() {
		ArrayList<Account> lists = accessAccount(new Administrator());
		double funds = 0;
		for(Account a: lists) {
			funds += a.getBalance();
		} return funds;
	}

	/**
	 * Modify user's info (currently, user name only available)
	 */
	@Override
	public String modifyUserInfo(Account account) {
		System.out.println("You can modify your user name");
		System.out.println("Currenctly the registered name is: " + account.getUserName() + "\n");
		System.out.print("Enter your new name: ");
		account.setUserName(input.next());
		
		System.out.println("---------- The registered details");
		return account.getAccountDetails();
	}

}
