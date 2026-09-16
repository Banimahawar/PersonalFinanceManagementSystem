# Personal Finance Management System

## 1. Project Title

**Personal Finance Management System**

---

## 2. Project Overview

The Personal Finance Management System is a Java-based console application designed to help users manage their personal financial information.

The application provides a menu-driven interface through which users can record income, record expenses, manage budgets, view transactions, and generate financial reports.

The main purpose of this project is to provide a simple and organized way to manage personal finance records while demonstrating important Java programming concepts such as classes, objects, packages, modular programming, input validation, and service-based application design.

---

## 3. Problem Statement

Managing personal finances manually can be difficult. Users may record their income, expenses, and budgets in different notebooks or applications. This can make it difficult to track spending, monitor budgets, and understand financial activities.

The Personal Finance Management System provides a simple console-based solution for managing financial records in one place.

The system allows users to:

* Add income details.
* Add expense details.
* Manage budgets.
* View transaction information.
* Generate financial reports.
* Use a simple menu-driven interface.

---

## 4. Objectives

The main objectives of the project are:

1. To develop a simple personal finance management application.
2. To record income and expense information.
3. To organize financial transactions.
4. To allow users to create and manage budgets.
5. To generate financial reports.
6. To reduce manual financial record keeping.
7. To validate user input.
8. To demonstrate object-oriented programming in Java.
9. To divide the application into different packages and classes.
10. To create a simple and understandable console-based system.

---

## 5. Features

### 5.1 Income Management

The system allows users to enter income-related details.

Income records may include information such as:

* Income ID
* Income source
* Income category
* Amount
* Date
* Description

The income functionality helps users keep track of money received from different sources.

---

### 5.2 Expense Management

The system allows users to record their expenses.

Expense records may include information such as:

* Expense ID
* Expense category
* Amount
* Date
* Description
* Payment method

This functionality helps users monitor their spending activities.

---

### 5.3 Budget Management

The system provides budget-related functionality.

Users can enter budget details such as:

* Budget ID
* Budget category
* Budget limit

Budgets can be used to plan spending for different categories, such as food, travel, education, shopping, or entertainment.

---

### 5.4 Transaction Management

The system manages financial transactions using transaction IDs.

Users can view or access transaction information by entering the required transaction ID.

Transactions help organize income and expense records in a structured way.

---

### 5.5 Report Generation

The system provides report-generation functionality.

Users can select a report choice from the report menu to view financial information.

Reports help users understand their income, expenses, and other financial records.

---

### 5.6 Input Validation

The system includes input-validation functionality.

Input validation helps:

* Reduce invalid input.
* Improve data accuracy.
* Make the application more reliable.
* Provide better user interaction.

---

## 6. Technologies Used

* **Programming Language:** Java
* **Programming Concept:** Object-Oriented Programming
* **Application Type:** Console-based application
* **Editor:** Visual Studio Code
* **Java Compiler:** `javac`
* **Execution Command:** `java`
* **Version Control:** GitHub
* **Operating System:** Windows

---

## 7. Project Structure

```text
PersonalFinanceManagementSystem/
│
├── src/
│   │
│   ├── model/
│   │   ├── Budget.java
│   │   ├── Expense.java
│   │   ├── Income.java
│   │   └── Transaction.java
│   │
│   ├── service/
│   │   ├── BudgetManager.java
│   │   ├── ExpenseService.java
│   │   ├── IncomeService.java
│   │   ├── MenuManager.java
│   │   ├── ReportManager.java
│   │   └── TransactionManager.java
│   │
│   ├── util/
│   │   └── InputValidator.java
│   │
│   └── Main.java
│
├── README.md
├── statement.md
└── .gitignore
```

---

## 8. Description of Project Packages

### 8.1 Model Package

The `model` package contains classes that represent the main financial entities of the application.

#### `Budget.java`

The `Budget` class represents a budget record.

It is related to budget information such as:

* Budget ID
* Budget category
* Budget limit

The class helps represent and organize budget data.

#### `Expense.java`

The `Expense` class represents an expense record.

It is used for storing expense-related information such as:

* Expense ID
* Expense category
* Expense amount
* Expense date
* Expense description
* Payment method

#### `Income.java`

The `Income` class represents an income record.

It is used for storing income-related information such as:

* Income ID
* Income source
* Income category
* Income amount
* Income date
* Income description

#### `Transaction.java`

The `Transaction` class represents transaction-related information.

It helps organize common financial transaction details, such as:

* Transaction ID
* Transaction type
* Category
* Amount
* Date
* Description

The exact fields depend on the implementation of the class.

---

### 8.2 Service Package

The `service` package contains classes responsible for performing the main application operations.

#### `BudgetManager.java`

Responsible for budget-related operations, including entering and managing budget information.

#### `ExpenseService.java`

Responsible for handling expense-related operations and recording expense details.

#### `IncomeService.java`

Responsible for handling income-related operations and recording income details.

#### `MenuManager.java`

Responsible for displaying the application menu and handling the user's menu choices.

#### `ReportManager.java`

Responsible for generating reports according to the selected report option.

#### `TransactionManager.java`

Responsible for handling transaction-related operations and viewing transaction information.

---

### 8.3 Utility Package

#### `InputValidator.java`

The `InputValidator` class is used to validate user input.

It helps reduce incorrect entries and improves the reliability of the application.

---

### 8.4 Main Class

#### `Main.java`

The `Main` class is the starting point of the application.

It starts the program and allows the user to interact with the personal finance management system through the console menu.

---

## 9. Application Workflow

The application follows a menu-driven workflow.

```text
Start Application
       |
       v
Display Main Menu
       |
       v
User Selects an Option
       |
       +----------------------+
       |                      |
       v                      v
Add Income              Add Expense
       |                      |
       +----------+-----------+
                  |
                  v
          Manage Transactions
                  |
                  v
             Manage Budget
                  |
                  v
            Generate Report
                  |
                  v
                 Exit
```

The user selects an option from the main menu, enters the required information, and receives the relevant output.

---

## 10. Main Menu Operations

The application provides different menu options for managing financial records.

### Option 1: Add Income

This option allows the user to enter an income record.

Example input:

```text
Income ID: 1
Income Source: Salary
Income Category: Job
Amount: 25000
Date: 2026-09-17
Description: Monthly salary received
```

---

### Option 2: Add Expense

This option allows the user to enter an expense record.

Example input:

```text
Expense ID: 1
Expense Category: Food
Amount: 500
Date: 2026-09-17
Description: Lunch with friends
Payment Method: Cash
```

---

### Option 3: Budget Operation

This option may ask for budget-related details, depending on the implementation.

Example input:

```text
Budget ID: 1
Budget Category: Food
Budget Limit: 5000
```

---

### Option 4: Transaction Operation

This option may ask for a transaction ID.

Example input:

```text
Transaction ID: 1
```

The transaction ID is used to identify the required transaction.

---

### Option 5: Reports

This option allows the user to select a report choice.

Example input:

```text
Report Choice: 1
```

The available report choices depend on the implementation of the report manager.

---

## 11. Requirements

### Hardware Requirements

* Computer or laptop.
* Minimum 4 GB RAM recommended.
* Basic storage space for the project files.

### Software Requirements

* Java JDK 8 or above.
* Visual Studio Code or another Java-supported editor.
* Windows, Linux, or macOS.
* Terminal or command prompt.

---

## 12. How to Compile and Run

### Step 1: Open the Project

Open the `PersonalFinanceManagementSystem` folder in Visual Studio Code.

### Step 2: Open the Terminal

Open the terminal from:

```text
Terminal → New Terminal
```

Make sure the terminal is opened in the project root directory.

### Step 3: Compile the Java Files

For PowerShell, use:

```powershell
javac -d out (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
```

### Step 4: Run the Application

```powershell
java -cp out Main
```

The main menu will appear in the terminal.

---

## 13. Testing

The following operations were tested during development:

* Starting the application.
* Displaying the main menu.
* Adding income.
* Adding expenses.
* Entering payment method details.
* Entering budget ID.
* Entering budget category.
* Entering budget limit.
* Entering transaction ID.
* Selecting a report choice.
* Compiling the Java source files.
* Running the application through the terminal.

### Compilation Test

```powershell
javac -d out (Get-ChildItem -Path src -Recurse -Filter *.java).FullName
```

### Execution Test

```powershell
java -cp out Main
```

The application was tested using normal valid inputs for the main menu operations.

---

## 14. Non-Functional Requirements

### Usability

The application should provide clear prompts and simple menu options so that users can easily enter financial information.

### Reliability

The application should process valid input correctly and should avoid unnecessary program crashes.

### Maintainability

The code is divided into model, service, and utility packages to make the project easier to understand and maintain.

### Performance

The application should respond quickly to normal user operations.

### Portability

The application should run on systems that have a compatible Java JDK installed.

### Simplicity

The application uses a console-based interface that does not require advanced hardware or software.

---

## 15. Limitations

* The application uses a console-based interface.
* It does not currently provide a graphical user interface.
* It does not process real payments.
* It does not connect to online banking services.
* It does not include online account synchronization.
* Advanced database support may not be included.
* The available reports depend on the current implementation.
* User authentication may not be included.

---

## 16. Future Enhancements

The following features can be added in the future:

* Graphical user interface.
* Database connectivity.
* User login and authentication.
* Multiple-user support.
* Monthly and yearly financial summaries.
* Charts and graphs.
* Search and filtering.
* Export reports to PDF or CSV.
* Automatic budget alerts.
* Improved exception handling.
* Mobile application support.
* Cloud-based data storage.

---

## 17. Conclusion

The Personal Finance Management System is a Java console application that provides basic facilities for managing personal income, expenses, budgets, transactions, and reports.

The project demonstrates the use of Java classes, objects, packages, service classes, utility classes, input validation, and menu-driven programming.

The model package contains the main financial classes:

* `Budget`
* `Expense`
* `Income`
* `Transaction`

The service package handles the main application operations, while the utility package supports input validation.

The project can be extended in the future with database storage, graphical interfaces, advanced reports, authentication, and automatic financial analysis.

---

## 18. Author

Developed as an academic Java project.

**Project Name:** Personal Finance Management System
