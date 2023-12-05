# Cat Digital Bank

Cat Digital Bank is a project that implements a simple banking system with different account types.

## Overview

Cat Digital Bank is designed to manage various types of bank accounts for customers. It includes classes representing accounts, a bank, and customers. The system allows for basic banking operations such as deposits, withdrawals, and transfers between accounts.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Classes](#classes)
  - [1. `Accounts`](#1-accounts)
  - [2. `Bank`](#2-bank)
  - [3. `CurrentAccounts`](#3-currentaccounts)
  - [4. `SavingsAccounts`](#4-savingsaccounts)
  - [5. `Customer`](#5-customer)
  - [6. `IAccount`](#6-iaccount)
  - [7. `Main`](#7-main)
- [Contributing](#contributing)

## Prerequisites

- Java Development Kit (JDK) installed
- Integrated Development Environment (IDE) for Java (e.g., Eclipse, IntelliJ, VS Code)

## Getting Started

1. Clone the repository to your local machine.

   ```bash
   git clone https://github.com/your-username/cat-digital-bank.git
   ```

2. Open the project in your preferred IDE.

3. Compile and run the `Main` class.

## Project Structure

The project is structured as follows:

- `src/`: Source code files
  - `Main.java`: Main class to run the Cat Digital Bank system
  - `Accounts.java`: Abstract class representing a generic bank account
  - `Bank.java`: Class representing Cat Digital Bank with a name and a list of accounts
  - `CurrentAccounts.java`: Specific type of account (extends `Accounts`) for current accounts
  - `SavingsAccounts.java`: Specific type of account (extends `Accounts`) for savings accounts
  - `Customer.java`: Class representing a customer with a name
  - `IAccount.java`: Interface defining the methods that a bank account must implement

## Usage

1. Run the `Main` class to execute the Cat Digital Bank system.

2. Follow the instructions in the console to interact with the system. You can create customer accounts, deposit money, transfer funds between accounts, and print account statements.

3. The system provides a method in `Main` to print a summary of Cat Digital Bank, including its name and the list of accounts.

## Classes

### 1. `Accounts`

Abstract class representing a generic bank account. It provides basic methods for withdrawal, deposit, transfer, and printing statements.

- **Attributes:**
  - `private static final int DEFAULT_AGENCY`: Default agency for new accounts.
  - `private static int SEQUENTIAL`: Sequential number for account creation.
  - `protected int agency`: Account's agency.
  - `protected int number`: Account number.
  - `protected double balance`: Account balance.
  - `protected Customer customer`: Customer associated with the account.

- **Methods:**
  - `public Accounts(Customer customer)`: Constructor to initialize account attributes.
  - `public Accounts(int agency, Customer customer)`: Additional constructor allowing the definition of the agency.
  - `public void withdraw(double amount)`: Withdraws the specified amount from the account.
  - `public void deposit(double amount)`: Deposits the specified amount into the account.
  - `public void transfer(double amount, IAccount destinationAccount)`: Transfers the specified amount to another account.
  - `public int getAgency()`: Retrieves the account's agency.
  - `public int getNumber()`: Retrieves the account number.
  - `public double getBalance()`: Retrieves the account balance.
  - `protected void printCommonInfo()`: Prints common information about the account.
  - `@Override public String toString()`: Provides a string representation of the account.

### 2. `Bank`

Class representing Cat Digital Bank with a name and a list of accounts. It provides methods to add and retrieve accounts.

- **Attributes:**
  - `private String name`: Cat Digital Bank's name.
  - `private List<Accounts> accounts`: List of accounts associated with Cat Digital Bank.

- **Methods:**
  - `public Bank(String name)`: Constructor to initialize Cat Digital Bank's name.
  - `public String getName()`: Retrieves Cat Digital Bank's name.
  - `public void setName(String name)`: Sets Cat Digital Bank's name.
  - `public List<Accounts> getAccounts()`: Retrieves the list of accounts.
  - `public void setAccounts(List<Accounts> accounts)`: Sets the list of accounts.
  - `public void addAccount(Accounts account)`: Adds an account to Cat Digital Bank.

### 3. `CurrentAccounts`

A specific type of account (extends `Accounts`) for current accounts.

- **Methods:**
  - `public CurrentAccounts(Customer customer)`: Constructor to initialize a current account.
  - `@Override public void printStatement()`: Prints the current account statement.

### 4. `SavingsAccounts`

A specific type of account (extends `Accounts`) for savings accounts.

- **Methods:**
  - `public SavingsAccounts(Customer customer)`: Constructor to initialize a savings account.
  - `@Override public void printStatement()`: Prints the savings account statement.

### 5. `Customer`

Class representing a customer with a name.

- **Attributes:**
  - `private String name`: Customer's name.

- **Methods:**
  - `public String getName()`: Retrieves the customer's name.
  - `public void setName(String name)`: Sets the customer's name.

### 6. `IAccount`

Interface defining the methods that a bank account must implement.

- **Methods:**
  - `void withdraw(double amount)`: Withdraws the specified amount from the account.
  - `void deposit(double amount)`: Deposits the specified amount into the account.
  - `void transfer(double amount, IAccount destinationAccount)`: Transfers the specified amount to another account.
  - `void printStatement()`: Prints the account statement.

### 7. `Main`

Main class to run the Cat Digital Bank system. It demonstrates account interactions and provides a method to print a bank summary.

- **Methods:**
  - `public static void main(String[] args)`: Main method to execute the Cat Digital Bank system.
  - `private static void printBankSummary(Bank bank)`: Prints a summary of Cat Digital Bank, including its name and the list of accounts.

## Contributing

Feel free to contribute by forking the repository and creating a pull request. Report issues or suggest improvements in the [Issues](https://github.com/marcuscarvalhodev/java_projects/tree/main/CatDigitalBank) section.
