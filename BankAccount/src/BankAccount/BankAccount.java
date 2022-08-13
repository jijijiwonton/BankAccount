package BankAccount;

import java.util.Scanner;

import Admin.Administrator;

public class BankAccount {

	Scanner input = new Scanner(System.in);
	
	// Declare menu options
	private static final int QUIT_PROGRAM = 0;
	private static final int ADD_USER =1;
	private static final int DEPOSIT_MONEY = 2;
	private static final int WITHDRAW_MONEY = 3;
	
	public void runBankProgram() {
		
		Administrator admin = new Administrator();
		int userInput = _userInput();

		switch(userInput) {
		case QUIT_PROGRAM:
			System.out.println("Thanks for using Bank Account program");
			break;
		case ADD_USER:
			System.out.print("Enter your name please: ");
			String userName = input.next();
			System.out.print("Enter your password please (Password CANNOT include user name and the length MUST be over 8) ");
			String userPassword = input.next();
			System.out.print("If you want to deposit initial money, enter money or enter 0: ");
			double userInitialBalance = input.nextDouble();
			
			// User account registeration process
			Account newUser = new Account(userName, userPassword, userInitialBalance);
			
			System.out.println();
			// Confirm user information
			System.out.println(newUser.getAccountDetails() + "\n");
			
			System.out.print("If your information is right, enter 'yes' please > ");
			String userConfirm = input.next().toLowerCase();
			
			boolean isConfirmed = userConfirm.equals("yes") ? true : false;
			
			if(isConfirmed) {
				admin.addUser(newUser);
			} else {
				System.out.println(admin.modifyUserInfo(newUser));
			}
		}
	}
	
	/**
	 * A private helper method to store user input
	 * @return
	 */
	private int _userInput() {
		int option;
		
		System.out.println("Welcome to Bank Account program!");
		System.out.println("Please, enter your input and enjoy our bank program!" + "\n");
		System.out.println(QUIT_PROGRAM + " : Quit program");
		System.out.println(ADD_USER + " : Add user");
		System.out.println(DEPOSIT_MONEY + " : Deposit money");
		System.out.println(WITHDRAW_MONEY + " : Withdraw money");
		
		// User option whether keep doing an action for bank account or quitting program
		option = input.nextInt();

		// TODO: Validation
		if(option != QUIT_PROGRAM && option != ADD_USER && option != DEPOSIT_MONEY && option != WITHDRAW_MONEY) {
			// TODO: Custom exception needed
			throw new Error("Unavailable options");
		}
		
		return option;
	}
}
