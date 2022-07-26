package Admin;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import BankAccount.Account;

class AdministratorTest {

	Administrator admin = new Administrator();
	
	/**
	 * Verify a user exists
	 */
	@Test
	void testIsUserExistValidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		boolean isUserExist = admin.isUserExist(testAccount);
		assertTrue(isUserExist, "The testing user doesn't exist");
	}
	
	/**
	 * Verify a user doesn't exist that throws IllegalArgumentException error
	 */
	@Test
	void testIsUserExistInvalidCase(){
		Account testAccount = null;
		assertThrows(IllegalArgumentException.class, () -> {
			admin.isUserExist(testAccount);
		});
	}

	/**
	 * Verify the number is unique
	 */
	@Test
	void testIsNumberUniqueValidCase() {
		// Since we don't add any users yet, and just test with a literal String value,
		// Expected result is true
		boolean isNumberUnique = admin.isNumberUnique("number");
		assertEquals(isNumberUnique, true);
	}

	/**
	 * Verify the number is not unique
	 */
	@Test
	void testIsNumberUniqueInvalidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		
		// Since we test a number that's already created, the expected result is false
		boolean isNumberUnique = admin.isNumberUnique(testAccount.getNumber());
		assertEquals(isNumberUnique, false);
	}

	/**
	 * Verify to get accessed all account details
	 */
	@Test
	void testAccessAccountValidCase() {
		// Expected result
		ArrayList<Account> accessedToAccount = admin.accessAccount(admin);
		
		// Actual result
		ArrayList<Account> manageAccount = new ArrayList<Account>();
		assertEquals(accessedToAccount, manageAccount);		
	}
	
	/**
	 * Verify to get denied all account details
	 */
	@Test
	void testAccessAccountInvalidCase() {
		assertThrows(IllegalArgumentException.class, () -> {
			admin.accessAccount(null);			
		});		
	}

	/**
	 * Verify to withdraw money with sufficient balance
	 */
	@Test
	void testIsBalanceSufficientValidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		boolean isBalanceSufficient = admin.isBalanceSufficient(testAccount, 2500);
		
		assertEquals(isBalanceSufficient, true);		
	}
	
	/**
	 * Verify not to withdraw money with insufficient balance
	 */
	@Test
	void testIsBalanceSufficientInvalidCase() {
		Account testAccount = new Account("Jiwon", "12345678", 2500);
		admin.addUser(testAccount);
		
		assertThrows(IllegalArgumentException.class, () -> {
			admin.isBalanceSufficient(testAccount, 3000);
		});		
	}
	
	/**
	 * Verify to view all available funds
	 */
	@Test
	void testTotalFunds() {
		Account testAccount1 = new Account("Jiwon1", "12345678", 2500);
		Account testAccount2 = new Account("Jiwon2", "12345678", 2500);
		
		admin.addUser(testAccount1);
		admin.addUser(testAccount2);
		
		double totalFunds = admin.totalFunds();
		
		assertEquals(totalFunds, 5000);
	}
}
