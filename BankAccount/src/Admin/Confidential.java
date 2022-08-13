package Admin;

import java.util.ArrayList;

import BankAccount.Account;

interface Confidential {
	
	ArrayList<Account> manageAccount = new ArrayList<Account>();
	
	boolean isUserExist(Account account);
	
	String uniqueNumberGenerator();
	
	boolean isNumberUnique(String number);
	
	ArrayList<Account> accessAccount(Object obj);
	
	boolean isBalanceSufficient(Account user, double money);
	
	String modifyUserInfo(Account account);
}
