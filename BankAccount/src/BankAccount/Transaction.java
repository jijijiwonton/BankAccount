package BankAccount;

import java.util.Scanner;

import Admin.Administrator;

public class Transaction {
	
	Administrator admin = new Administrator();
	Scanner input = new Scanner(System.in);
	
	// Default constructor
	public Transaction() {
	}
	
	// TODO: after implementing code in 2 classes
	private Income income;
	private Expense expense;
	
	/**
	 * Deposit money to user's bank account
	 * @param account
	 * @return money to deposit
	 */
	protected double deposit(Account account) {
		if(admin.isUserExist(account)) {
				double beforeDeposit = account.getBalance();
				double moneyToDeposit = _inputMoney();
				account.setBalance(beforeDeposit += moneyToDeposit);
				return moneyToDeposit;
		} else {
			throw new Error(InternalSystem.NO_USER_EXIST);
		}
	}
	
	/**
	 * Withdraw money from a user's bank account
	 * @param account
	 * @return money to withdraw
	 */
	protected double withdraw(Account user) {
		if(admin.isUserExist(user)) {
			double beforeWithdraw = user.getBalance();
			double moneyToWithdraw = _inputMoney();
			if(admin.isBalanceSufficient(user, moneyToWithdraw)) {
				user.setBalance(beforeWithdraw -= moneyToWithdraw);
				return moneyToWithdraw;
			} else {
				throw new Error(InternalSystem.BALANCE_INSUFFICIENT);
			}
		} else {
			throw new Error(InternalSystem.NO_USER_EXIST);
		}
	}
	
	/**
	 * A private helper method for transaction
	 * @return input money
	 */
	private double _inputMoney() {
		System.out.print("Input money: ");
		return input.nextDouble();
	}
}
