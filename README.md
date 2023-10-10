# Week6-Inventory

Mini-Project for week 6

Inventory Management System
Overview:
Create a simple Inventory Management System that allows users to add, delete, and manage items. The project will involve writing Java code that covers Exceptions, Generics, Maven for project management, and Unit Testing with JUnit.


Day 1: Exceptions
Objective: Implement basic functionality with a focus on exception handling.
Requirements:
Create a class Item with fields like id, name, and quantity.
Create a class Inventory which holds a list of items.
Implement methods for adding and removing items.
Use custom exceptions to handle cases like "Item not found" or "Not enough items in stock."
Tasks:
Define the custom exceptions (ItemNotFoundException, InsufficientStockException).
Implement methods in Inventory that throw these exceptions appropriately.

___

Day 2: Generics
Objective: Extend the project to use Java Generics.
Requirements:
Make the Inventory class generic so that it can hold different types of items.
Create subclasses of Item like FoodItem, ElectronicsItem etc.
Update the Inventory class to work seamlessly with these subclasses using Generics.
Tasks:
Update the Inventory class to use Generics.
Test by creating inventories that hold different types of items.

___

Day 3: Maven
Objective: Use Maven for project management.
Requirements:
Initialize the project as a Maven project.
Add necessary dependencies in pom.xml (e.g., JUnit for the upcoming testing).
Demonstrate how to build and run the project using Maven commands.
Tasks:
Create a pom.xml with the necessary configurations.
Learn how to run and build the project using Maven (mvn clean install, mvn compile, etc.).

___

Day 4: Unit Testing with JUnit
Objective: Write unit tests for the project using JUnit.
Requirements:
Write tests to cover all major functionalities.
Pay special attention to edge cases and use the custom exceptions defined on Day 1.
Aim for good test coverage, and make sure all tests pass.
Tasks:
Create test classes (e.g., ItemTest, InventoryTest) using JUnit.
Write various test methods to check the functionality of the application.
Run tests using both IDE and Maven (mvn test).
