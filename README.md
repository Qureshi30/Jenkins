# Jenkins CI/CD Demo Project

A simple Maven-based Java project to demonstrate Jenkins CI/CD pipeline integration.

## Project Structure

```
jenkins/
├── Jenkinsfile          # Jenkins pipeline configuration
├── pom.xml              # Maven project configuration
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               ├── App.java          # Main application
│   │               └── Calculator.java   # Calculator utility
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── CalculatorTest.java  # Unit tests
└── README.md
```

## Requirements

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean compile
```

## Running Tests

```bash
mvn test
```

## Creating a Package

```bash
mvn package
```

## Running the Application

```bash
java -jar target/jenkins-demo-1.0-SNAPSHOT.jar
```

Or using Maven:

```bash
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Jenkins Pipeline

This project includes a `Jenkinsfile` that defines a CI/CD pipeline with the following stages:

1. **Checkout** - Clones the repository
2. **Compile** - Compiles the Java source code
3. **Build** - Creates a JAR package
4. **Test** - Runs unit tests
5. **Deploy** - Placeholder for deployment steps

## Features

- Simple Calculator implementation with basic operations (add, subtract, multiply, divide)
- Unit tests with JUnit 4
- Maven build configuration
- Jenkins pipeline automation
