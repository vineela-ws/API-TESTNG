API-TESTNG
This repository contains automated API tests built using TestNG framework and Rest Assured library. 
The goal of this project is to validate the behaviour of various RESTful APIs through efficient, maintainable, and readable test scripts.

🧰 Tech Stack
Java
TestNG
Rest Assured
Maven
JSON
Postman (for initial testing and validation)

📁 Project Structure
bash
Copy
Edit
API-TESTNG/
│
├── src/
│   └── test/
│       └── java/
│           └── tests/              # Test classes written in TestNG
│           └── utils/              # Utility classes for reusable methods
│
├── testng.xml                      # TestNG suite configuration
├── pom.xml                         # Maven dependencies and plugins
└── README.md


✅ Features
Setup and teardown using TestNG annotations
Test REST APIs using Rest Assured
Validations of status codes, headers, and response body
Organized and modular test design
Easy-to-maintain and scalable test structure

📊 Sample Test Coverage
GET requests

POST requests with payload validation

PUT and DELETE method tests

Status code and schema validation

Negative and edge case scenarios

📌 Best Practices Followed
TestNG grouping and prioritization

Logging and assertions for better debugging

Reusability via utility methods

Clear separation of test logic and data
