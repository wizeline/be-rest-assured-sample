# Rest-Assured Automation Framework

This repository contains a boilerplate automation test framework developed for testing a REST API.
It contains some basic tests with GET and POST http methods, using TestNG framework

## Requirements

- Java 8 or higher is installed to your local system.
- Maven is installed in your local system to install dependencies or run tests via command line.

## Usages

At the first, clone or download this dir. Then install dependencies:

```bash
$ mvn clean install
```

If you want to only run all tests with command line, you can run:

```bash
$ mvn test
```
NOTE: You can also create a testng.xml file and specify the specific test cases that you want to run with maven.

Otherwise, you can go directly to the test class, where your tests are located and run them
directly with TestNG plugin (Available in TestNG and IntelliJ).

This example has the Maven dependencies below, located on the POM file:

- [TestNg] testing framework ()
- [Rest-Assured] Java based REST automation library.

## Test files

- `src/test/java/apidemo/`
  - `tests/`
    - `GetTest.js` : Group of tests using GET request.
    - `PostTest.js` : Group of test using POST request.
    - `StandardTest.js` : Basic Test.

## Continuous Integration
For Continuous Integration, you can integrate the mvn commands in your pipeline, such as:
 - mvn clean install

