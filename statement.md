# Personal Finance Management System

## 1. Project Title

**Personal Finance Management System**

---

## 2. Problem Statement

Managing personal finances manually can be difficult and time-consuming. People often record their income, expenses, and budgets in notebooks, spreadsheets, or different applications.

When financial information is not organized properly, users may face difficulties such as:

* Forgetting important expenses.
* Losing track of income.
* Spending more than the planned budget.
* Finding it difficult to view previous transactions.
* Understanding monthly financial activities.
* Preparing financial reports manually.

The **Personal Finance Management System** is developed to provide a simple console-based solution for managing personal financial information in an organized manner.

The system allows users to record income, record expenses, manage budgets, view transactions, and generate reports using a menu-driven Java application.

---

## 3. Project Description

The Personal Finance Management System is a Java-based console application.

It uses a modular structure with separate packages for:

* Model classes
* Service classes
* Utility classes
* Main application execution

The application provides a simple interface where users select an option from the main menu and enter the required financial information.

The system focuses on basic personal finance activities such as income management, expense management, budget management, transaction management, and report generation.

---

## 4. Objectives

The main objectives of this project are:

1. To develop a simple personal finance management system using Java.
2. To provide a menu-driven console interface.
3. To allow users to record income details.
4. To allow users to record expense details.
5. To organize financial information into different model classes.
6. To manage budgets using budget IDs, categories, and budget limits.
7. To manage transactions using transaction IDs.
8. To provide report-generation functionality.
9. To validate user inputs.
10. To reduce manual financial record keeping.
11. To demonstrate object-oriented programming concepts.
12. To demonstrate modular programming using Java packages.
13. To improve the organization of personal financial records.

---

## 5. Scope of the Project

The scope of the project is limited to basic personal finance management through a Java console application.

### 5.1 Included in the Scope

The system includes:

* Income record management.
* Expense record management.
* Budget management.
* Transaction management.
* Report generation.
* Input validation.
* Menu-driven user interaction.
* Separate model, service, and utility packages.

### 5.2 Outside the Current Scope

The following features are not included in the current scope:

* Online banking integration.
* Real-time bank account synchronization.
* Real payment processing.
* Automatic connection with financial institutions.
* Advanced graphical user interface.
* Cloud-based storage.
* Mobile application support.
* Advanced financial prediction.
* Multi-user authentication system.

These features may be considered as future enhancements.

---

## 6. Target Users

The target users of the system include:

### Students

Students can use the system to track pocket money, educational expenses, food expenses, and other daily spending.

### Working Professionals

Working professionals can use the system to record salary, expenses, budgets, and personal transactions.

### Individual Users

Any individual who wants to organize personal income and expenses can use the application.

### Budget-Conscious Users

Users who want to set spending limits for categories such as food, shopping, travel, or entertainment can use the budget functionality.

---

## 7. High-Level Features

### 7.1 Income Management

The income management feature allows users to enter income-related information.

Income details may include:

* Income ID.
* Income source.
* Income category.
* Amount.
* Date.
* Description.

The income model is represented by the `Income.java` class, while income-related operations are handled by `IncomeService.java`.

---

### 7.2 Expense Management

The expense management feature allows users to record expenses.

Expense details may include:

* Expense ID.
* Expense category.
* Amount.
* Date.
* Description.
* Payment method.

The expense model is represented by the `Expense.java` class, while expense-related operations are handled by `ExpenseService.java`.

---

### 7.3 Budget Management

The budget management feature allows users to create and manage budgets.

Budget details may include:

* Budget ID.
* Budget category.
* Budget limit.

The budget model is represented by the `Budget.java` class, while budget-related operations are handled by `BudgetManager.java`.

---

### 7.4 Transaction Management

The transaction management feature allows users to manage financial transactions.

Transactions may be identified using transaction IDs.

The transaction model is represented by the `Transaction.java` class, while transaction-related operations are handled by `TransactionManager.java`.

---

### 7.5 Report Generation

The report-generation feature allows users to select a report choice and view financial information.

Report-related operations are handled by `ReportManager.java`.

The available report choices depend on the current implementation of the application.

---

### 7.6 Menu Management

The application uses a menu-driven interface.

The `MenuManager.java` class is responsible for managing menu-related operations and connecting the user’s menu selection with the appropriate functionality.

---

### 7.7 Input Validation

The system includes an input-validation utility.

The `InputValidator.java` class helps validate user inputs and reduce invalid entries.

Input validation improves the reliability and usability of the application.

---

## 8. Functional Requirements

### FR1: Display Main Menu

The system shall display the available menu options to the user.

### FR2: Add Income

The system shall allow the user to enter and record income details.

### FR3: Add Expense

The system shall allow the user to enter and record expense details.

### FR4: Manage Budgets

The system shall allow the user to enter budget details such as budget ID, category, and budget limit.

### FR5: Manage Transactions

The system shall allow the user to access transaction information using a transaction ID.

### FR6: Generate Reports

The system shall allow the user to select a report choice and generate the corresponding report.

### FR7: Validate Inputs

The system shall validate user input wherever validation is required.

### FR8: Display Results

The system shall display the result of the selected operation in the console.

### FR9: Exit the Application

The system shall provide an option for the user to exit the application.

---

## 9. Non-Functional Requirements

### 9.1 Usability

The application should be easy to use through clear prompts and simple menu options.

### 9.2 Reliability

The application should process valid input correctly and avoid unnecessary crashes.

### 9.3 Performance

The application should respond quickly to normal user operations.

### 9.4 Maintainability

The project should be easy to maintain because the code is divided into model, service, and utility packages.

### 9.5 Portability

The application should run on systems that have a compatible Java JDK installed.

### 9.6 Simplicity

The system should provide a simple console-based interface without requiring advanced hardware.

### 9.7 Readability

The source code should be organized into meaningful classes and packages so that it is easier to understand.

---

## 10. System Modules

The application is divided into the following major modules.

### Module 1: Income Management Module

Responsible for:

* Entering income details.
* Creating income records.
* Managing income-related operations.

Main class:

```text
IncomeService.java
```

Model class:

```text
Income.java
```

---

### Module 2: Expense Management Module

Responsible for:

* Entering expense details.
* Recording expense information.
* Handling payment method details.

Main class:

```text
ExpenseService.java
```

Model class:

```text
Expense.java
```

---

### Module 3: Budget Management Module

Responsible for:

* Entering budget IDs.
* Entering budget categories.
* Setting budget limits.
* Managing budget information.

Main class:

```text
BudgetManager.java
```

Model class:

```text
Budget.java
```

---

### Module 4: Transaction Management Module

Responsible for:

* Managing transaction records.
* Accessing transactions using transaction IDs.
* Displaying transaction information.

Main class:

```text
TransactionManager.java
```

Model class:

```text
Transaction.java
```

---

### Module 5: Report Management Module

Responsible for:

* Displaying report choices.
* Generating financial reports.
* Presenting financial information.

Main class:

```text
ReportManager.java
```

---

### Module 6: Menu and Validation Module

Responsible for:

* Displaying the main menu.
* Managing user choices.
* Validating input values.

Main classes:

```text
MenuManager.java
InputValidator.java
```

---

## 11. Project Package Structure

```text
src/
│
├── model/
│   ├── Budget.java
│   ├── Expense.java
│   ├── Income.java
│   └── Transaction.java
│
├── service/
│   ├── BudgetManager.java
│   ├── ExpenseService.java
│   ├── IncomeService.java
│   ├── MenuManager.java
│   ├── ReportManager.java
│   └── TransactionManager.java
│
├── util/
│   └── InputValidator.java
│
└── Main.java
```

---

## 12. Description of Classes

### Model Classes

#### `Budget.java`

Represents budget information, including the budget ID, category, and budget limit.

#### `Expense.java`

Represents expense information, including expense details and payment method.

#### `Income.java`

Represents income information, including income source, category, amount, date, and description.

#### `Transaction.java`

Represents transaction-related information such as transaction ID, type, category, amount, date, and description.

---

### Service Classes

#### `BudgetManager.java`

Handles budget-related operations.

#### `ExpenseService.java`

Handles expense-related operations.

#### `IncomeService.java`

Handles income-related operations.

#### `MenuManager.java`

Handles the application menu and user choices.

#### `ReportManager.java`

Handles report-related operations.

#### `TransactionManager.java`

Handles transaction-related operations.

---

### Utility Class

#### `InputValidator.java`

Provides input-validation functionality to reduce invalid entries.

---

### Main Class

#### `Main.java`

Acts as the entry point of the application and starts the console-based system.

---

## 13. Application Workflow

The application follows the workflow below:

```text
Start
  |
  v
Display Main Menu
  |
  v
User Selects an Option
  |
  +--------------------+
  |                    |
  v                    v
Add Income        Add Expense
  |                    |
  +---------+----------+
            |
            v
    Manage Transactions
            |
            v
      Manage Budget
            |
            v
     Generate Reports
            |
            v
           Exit
```

The user selects an operation, enters the required information, and receives the corresponding output.

---

## 14. Input and Output

### Input

The system accepts input through the console.

Examples of input include:

* Income ID.
* Expense ID.
* Budget ID.
* Transaction ID.
* Category.
* Amount.
* Date.
* Description.
* Payment method.
* Report choice.

### Output

The system displays:

* Main menu.
* Confirmation or result of an operation.
* Transaction information.
* Budget information.
* Report information.
* Validation messages where required.

---

## 15. Tools and Technologies

* Java.
* Object-Oriented Programming.
* Java classes and objects.
* Java packages.
* Visual Studio Code.
* Java Development Kit.
* PowerShell or Command Prompt.
* GitHub for version control and project submission.

---

## 16. Expected Outcome

The expected outcome of the project is a working Java console application that allows users to:

* Record income.
* Record expenses.
* Manage budgets.
* View transaction information.
* Generate reports.
* Use a simple menu-driven interface.
* Enter financial information in an organized manner.

The project also demonstrates the use of modular programming and object-oriented design in Java.

---

## 17. Limitations

The current system has the following limitations:

* It is a console-based application.
* It does not provide a graphical user interface.
* It does not connect to online banking services.
* It does not process real payments.
* It may not include advanced database functionality.
* It may not support multiple users.
* It may not provide automatic notifications.
* Report functionality depends on the available implementation.

---

## 18. Future Enhancements

Future versions of the system may include:

* Graphical user interface.
* Database connectivity.
* User login and authentication.
* Multiple-user support.
* Monthly and yearly reports.
* Graphs and charts.
* Search and filter functionality.
* Export reports to PDF or CSV.
* Automatic budget alerts.
* Cloud-based storage.
* Mobile application support.
* Improved exception handling.
* Automatic financial analysis.

---

## 19. Conclusion

The Personal Finance Management System is designed to provide a simple and organized solution for managing personal financial information.

The application includes separate model classes for budgets, expenses, income, and transactions. It also contains service classes for handling major operations, a utility class for input validation, and a main class for starting the application.

The project demonstrates Java programming concepts such as:

* Classes and objects.
* Object-oriented programming.
* Packages.
* Modular design.
* Service-based organization.
* Input validation.
* Console-based interaction.

The system can be enhanced in the future by adding database support, graphical interfaces, authentication, advanced reports, and automatic budget notifications.

---

## 20. Project Author

**Project Name:** Personal Finance Management System

**Project Type:** Java Console Application

**Purpose:** Academic Java project
