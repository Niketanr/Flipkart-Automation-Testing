# E-Commerce Test Automation Framework

> A scalable end-to-end web automation framework developed using Selenium WebDriver, Java, TestNG, Cucumber BDD, and the Page Object Model (POM) for automating key user workflows on the Flipkart e-commerce platform.

---

## Project Overview

This project is designed to automate the core functionalities of the Flipkart web application by implementing a maintainable and reusable automation framework.

The framework follows industry-standard automation practices such as the **Page Object Model (POM)** to improve code reusability, readability, and maintainability. It supports automated execution of regression and functional test scenarios with detailed HTML reports.

---

## Objectives

- Automate critical user journeys on Flipkart
- Reduce manual testing effort
- Improve regression testing efficiency
- Build a reusable automation framework following industry best practices
- Generate detailed execution reports for test analysis

---

## Tech Stack

| Technology | Purpose |
|------------|---------|
| Java | Programming Language |
| Selenium WebDriver | Browser Automation |
| TestNG | Test Execution & Assertions |
| Cucumber BDD | Behavior Driven Development |
| Maven | Dependency Management |
| Page Object Model (POM) | Framework Design Pattern |
| Extent Reports | HTML Reporting |
| Git | Version Control |
| GitHub | Source Code Repository |

---

## Framework Architecture

```
TestNG Runner
       │
       ▼
Feature Files (BDD)
       │
       ▼
Step Definitions
       │
       ▼
Page Objects
       │
       ▼
WebDriver
       │
       ▼
Flipkart Web Application
```

---

## Automated Test Scenarios

### User Authentication

- Login with valid credentials
- Login validation

### Product Search

- Search for products
- Validate search results
- Open product details

### Shopping Cart

- Add product to cart
- Validate cart contents

### Reporting

- Generate Extent HTML Report
- Capture execution status

---

## Project Structure

```
Flipkart-Automation-Testing
│
├── src
│   ├── main
│   │    ├── pages
│   │    ├── utilities
│   │    └── base
│   │
│   └── test
│        ├── stepdefinitions
│        ├── runners
│        ├── features
│        └── tests
│
├── screenshots
├── test-output
├── extent-report
├── pom.xml
├── testng.xml
└── README.md
```

---

## Prerequisites

Before running this project, ensure the following are installed:

- Java JDK 17 or later
- Maven
- Eclipse / IntelliJ IDEA
- Google Chrome
- ChromeDriver (compatible version)
- Git

---

## Installation

Clone the repository

```bash
git clone https://github.com/<username>/Flipkart-Automation-Testing.git
```

Navigate to the project directory

```bash
cd Flipkart-Automation-Testing
```

Install dependencies

```bash
mvn clean install
```

---

## Running the Tests

### Using Maven

```bash
mvn test
```

### Using TestNG

Run the following file

```
testng.xml
```

---

## Test Reports

After execution, Extent Reports are generated automatically.

Example location

```
test-output/
```

The report includes

- Test Execution Summary
- Pass / Fail Status
- Execution Time
- Failure Details
- Screenshots (if configured)

---

## Framework Highlights

- Selenium WebDriver Automation
- Java-based Test Framework
- Page Object Model (POM)
- TestNG Integration
- Cucumber BDD
- Maven Build Management
- Extent HTML Reporting
- Reusable Components
- Easy to Maintain
- Scalable Project Structure

---

## Future Enhancements

- Data-Driven Testing using Excel
- Cross Browser Testing
- Parallel Test Execution
- Jenkins CI/CD Integration
- GitHub Actions Workflow
- Docker Support
- Selenium Grid Execution
- Log4j Logging
- Retry Failed Test Cases
- Screenshot Capture on Failure
- Email Report Integration
- Database Validation
- API Testing with Rest Assured

---

## Learning Outcomes

Through this project, I gained practical experience in:

- Automation Framework Design
- Selenium WebDriver
- Java Programming
- TestNG
- Cucumber BDD
- Page Object Model
- Maven
- Test Reporting
- Git Version Control
- Functional & Regression Testing

---

## Author

**R. Niketan**

Computer and Communication Engineering Student

GitHub: https://github.com/Niketanr

LinkedIn: https://linkedin.com/in/<your-profile>

Email: niketanniketan71@gmail.com

---

## License

This project is developed for educational and portfolio purposes.
