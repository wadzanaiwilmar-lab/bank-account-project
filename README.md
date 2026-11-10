Bank Account Program

A simple console-based bank account program written in Java. It was built in Eclipse as a beginner project to practise classes, objects, methods and conditional logic.

FEATURES

Create accounts with an owner name and starting balance.
Deposit money into an account.
Withdraw money, with a check that prevents overdrawing.
Transfer money between two accounts.
Check the balance of any account.

PROJECT STRUCTURE

bankAccountProject
Account.java (Account class and main method)

TECHNOLOGIES

Java
Eclipse IDE

HOW TO RUN

Clone the repository with this command:
git clone https://github.com/wadzanaiwilmar-lab/bank-account-project.git
Open the project in Eclipse.
Right-click Account.java, select Run As, then Java Application.

EXAMPLE OUTPUT

Wadzanai:500.0
Pam:200.0
Wadzanai Balance after deposit:700.0
Pam Balance after deposit:600.0
Insufficient funds
Wadzanai Balance after withdrawal:700.0
Success!
Pam Balance after withdrawal:500.0
Transfer done!
Wadzanai balance after transfer: 300.0
Pam balance after receiving: 900.0

HOW IT WORKS

deposit(double amount) adds the amount to the balance.
withdraw(double amount) subtracts the amount only if the balance is enough. Otherwise it prints “Insufficient funds” and leaves the balance unchanged.
getBalance() returns the current balance.
transfer(Account to, double amount) moves money from one account to another if the sender has enough funds.

AUTHOR

Wadzanai Wilmar Chirinda
Computer Science Student, University of the People
