# ATM Interface Project

## Project Overview
The ATM Interface is a Java-based console application that simulates basic ATM operations. It allows users to log in and perform banking operations through a menu-driven interface.

## Features
- User Login with User ID and PIN
- Check Account Balance
- Deposit Money
- Withdraw Money
- Transfer Money
- View Transaction History
- Exit the Application

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Scanner
- LocalDateTime
- IntelliJ IDEA

## Project Structure
```text
ATM_INTERFACE
└── src
    └── atm
        ├── Main.java
        ├── User.java
        ├── BankAccount.java
        ├── Transaction.java
        └── ATM.java
```

## Demo Login Details

**User 1**
- User ID: user101
- PIN: 1234
- Initial Balance: Rs. 5000

**User 2 (Transfer Receiver)**
- User ID: user102
- PIN: 5678
- Initial Balance: Rs. 3000

These are sample credentials for demonstration only.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Open `Main.java`.
3. Click the Run button.
4. Enter the demo User ID and PIN.
5. Select an option from the ATM menu.

## Java Classes Description
- **Main.java:** Starts the application and creates user accounts.
- **User.java:** Handles user login and account information.
- **BankAccount.java:** Manages balance, deposits, withdrawals, transfers and transaction history.
- **Transaction.java:** Stores transaction type, amount and date.
- **ATM.java:** Handles login and displays the ATM menu.

## Project Purpose
This project was developed as part of Java Development internship practice to understand Java fundamentals, classes, objects, methods and ArrayList.

**Note:** This is an educational ATM simulation, not a real banking application.
