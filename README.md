**NHS Automation Test Engineer Interview - Technical Assessment**
This repository showcases a BDD (Behavior-Driven Development) framework for test automation using Selenium-Cucumber-Java. The project demonstrates the development of automated acceptance tests with a focus on test coverage, separation of concerns, and execution control.

**Project Overview**

Utilizes Cucumber for writing behavior-driven test scenarios.
Leverages Selenium WebDriver for interacting with web browsers.
Employs Java for scripting functionalities.

**Running the Tests**

There are two ways to run the tests:

**Using Maven:**

Clean and Install:
Right-click on the project in your IDE and select Run As -> Maven clean.
Alternatively, navigate to the project directory in your terminal and run mvn clean install.
Run Tests:
Right-click on the project and select Run As -> Maven Test.
Alternatively, navigate to the project directory in your terminal and run mvn test.

**Using JUnit Runner:**

JUnit Configuration:
Execute Tests:
Right-click on the RunTest1 class and select Run As -> JUnit Test.


**Test Coverage**

The project incorporates various scenarios categorized using tags like "regression," "sanity," and "negative" to ensure comprehensive test coverage. Scenarios cover both positive (happy flow) and negative (unhappy flow) user interactions. Tags allow you to execute specific test sets based on your testing needs.

**Configuration File**

A config.properties file is included to configure the browser used for test automation. You can modify this file to select your preferred browser.

**Reports**

A cucumber.html report is generated after each execution.
This report is located under the target/cucumber folder.
