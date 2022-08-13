package BankAccount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Admin.Administrator;

class TransactionTest {
	
	Administrator admin = new Administrator();
	Transaction transaction = new Transaction();

	/**
	 * Verify deposit function for a valid case
	 */
	@Test
	void testDepositForValidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		
		double beforeDeposit = testAccount.getBalance();
		double depositMoney = transaction.deposit(testAccount);
		
		double afterDeposit = testAccount.getBalance();
		
		assertEquals(afterDeposit, beforeDeposit + depositMoney);
	}
	
	/**
	 * Verify deposit function for invalid case
	 * User doesn't exist
	 */
	@Test
	void testDepositForUserDoesntExist() {
		Account testAccount = null;
		
		assertThrows(IllegalArgumentException.class, () -> {
			transaction.deposit(testAccount);
		});
	}

	/**
	 * Verify withdraw function for a valid case
	 */
	@Test
	void testWithdrawForValidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		
		double beforeWithdraw = testAccount.getBalance();
		System.out.println("Junit testing ... input should be less than or equal to 2500 for a valid case");
		double withdrawMoney = transaction.withdraw(testAccount);
		
		double afterWithdraw = testAccount.getBalance();
		
		assertEquals(afterWithdraw, beforeWithdraw - withdrawMoney);		
	}

	/**
	 * Verify withdraw function for invalid case
	 * Insufficient balance that returns IllegalArgumentException error
	 */
	@Test
	void testWithdrawForInsufficientBalance() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		
		assertThrows(IllegalArgumentException.class, () -> {
			System.out.println("Junit testing ... input should be more than 2500 for an invalid case");
			transaction.withdraw(testAccount);
		});
	}
	
	/**
	 * Verify withdraw function for invalid case
	 * The user doesn't exist that returns IllegalArgumentException error
	 */
	@Test
	void testWithdrawForNoUserExist() {
	Account testAccount = null;
		
		assertThrows(IllegalArgumentException.class, () -> {
			transaction.withdraw(testAccount);
		});	
	}
}
