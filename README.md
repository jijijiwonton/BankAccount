# BankAccount

## Author
Jiwon Hwang - Currently QA Software Enginner

## Program Description
A basic Java console program, QA is verified by Junit test.

Register user information / transaction (deposit / withdraw ) / Manage user account as an admin.

## Folder Structure
/BankAccount
|-BankAccount/src
 |-Admin
  |-Administrator.java
  |-AdministratorTest.java
  |-Confidential.java
 |-BankAccount
  |-Account.java
  |-BankAccount.java
  |-Expense.java
  |-Income.java
  |-InternalSystem.java
  |-Main.java
  |-Transaction.java
  |-TransactionTest.java
  
 * Administrator class implements Confidential interface
 * Confidential interface has some abstract methods
 * Account class has basic methods for user account and some encapsulation 
 * BankAccount class has 2 methods running the application
 * Expense / Income empty classes -> created to deal with special occasion (not implemented)
 * InternalSystem class has static const global messages (to avoid hard coding)
 * Main class - View 
 * Transaction class has methods for bank transactions ( deposit / withdraw )
 
 ```
 Confidential Interface
 - isUserExist(Account account);
 - uniqueNumberGenerator();
 - isNumberUnique();
 - accessAccount(Object obj);
 - isBalanceSufficient(Account user, double money);
 - modifyUserInfo(Account account);
 ```

## Trigger
This is the first Java program that I did with software management tool.
I'm a OOP person. When I learned them during the 2nd semester at school, it made me realize the importance of programming.

I used Jira to keep track of my progression.
