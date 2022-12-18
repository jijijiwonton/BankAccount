# BankAccount

## Author
Jiwon Hwang - Currently QA Software Enginner</br>

## Program Description
A basic Java console program, QA is verified by Junit test.</br>

Register user information / transaction (deposit / withdraw ) / Manage user account as an admin.</br>

## Folder Structure
|BankAccount</br> 
&nbsp;|BankAccount/src</br>
&emsp;|Admin</br> 
&emsp;&nbsp;|-Administrator.java</br> 
&emsp;&nbsp;|-AdministratorTest.java</br> 
&emsp;&nbsp;|-Confidential.java</br> 
&emsp;|BankAccount</br> 
&emsp;&nbsp;|-Account.java</br> 
&emsp;&nbsp;|-BankAccount.java</br> 
&emsp;&nbsp;|-Expense.java</br> 
&emsp;&nbsp;|-Income.java</br> 
&emsp;&nbsp;|-InternalSystem.java</br> 
&emsp;&nbsp;|-Main.java</br> 
&emsp;&nbsp;|-Transaction.java</br>
&emsp;&nbsp;|-TransactionTest.java</br> 
  
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
