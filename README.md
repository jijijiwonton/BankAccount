# BankAccount

## Author
Jiwon Hwang - Currently QA Software Enginner</br>

## Program Description
A basic Java console program, QA is verified by Junit test.</br>

Register user information / transaction (deposit / withdraw ) / Manage user account as an admin.</br>

## Folder Structure
/BankAccount</br> 
|-BankAccount/src</br>
 |-Admin</br> 
  |-Administrator.java</br> 
  |-AdministratorTest.java</br> 
  |-Confidential.java</br> 
 |-BankAccount</br> 
  |-Account.java</br> 
  |-BankAccount.java</br> 
  |-Expense.java</br> 
  |-Income.java</br> 
  |-InternalSystem.java</br> 
  |-Main.java</br> 
  |-Transaction.java</br>
  |-TransactionTest.java</br> 
  
 * Administrator class implements Confidential interface</br>
 * Confidential interface has some abstract methods</br>
 * Account class has basic methods for user account and some encapsulation</br>
 * BankAccount class has 2 methods running the application</br>
 * Expense / Income empty classes -> created to deal with special occasion (not implemented)</br>
 * InternalSystem class has static const global messages (to avoid hard coding)</br>
 * Main class - View</br>
 * Transaction class has methods for bank transactions ( deposit / withdraw )</br>
 
 ```
 Confidential Interface
 - isUserExist(Account account);</br>
 - uniqueNumberGenerator();</br>
 - isNumberUnique();</br>
 - accessAccount(Object obj);</br>
 - isBalanceSufficient(Account user, double money);</br>
 - modifyUserInfo(Account account);</br>
 ```

## Trigger
This is the first Java program that I did with software management tool.</br>
I'm a OOP person. When I learned them during the 2nd semester at school, it made me realize the importance of programming.</br>

I used Jira to keep track of my progression.</br>
