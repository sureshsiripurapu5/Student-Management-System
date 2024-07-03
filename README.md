![Screenshot (31)](https://github.com/sureshsiripurapu5/Student-Management-System/assets/139056065/2aa26698-0b0d-4f8e-8f23-c8a1cc03767f)




## About

Student Management System web application using Spring Boot, Spring MVC, Thymeleaf, Spring Data JPA, and MySQL database.

## Features of the Student Management System

### CRUD Operations:
- Create: Add new students to the database.
- Read: Display a list of all students.
- Update: Modify existing student details.
- Delete: Remove students from the database.
  
### Entity Layer:
- Student Entity: Represents students with fields like id, firstName, lastName, and email.
- JPA Annotations: Utilizes annotations such as @Entity, @Id, @GeneratedValue, and @Column for ORM mapping.

### Repository Layer:
- StudentRepository: Extends JpaRepository to handle database operations for the Student entity.

### Service Layer:
- StudentService Interface: Declares methods for student management (getAllStudents, saveStudent, updateStudent, getStudentById, deleteStudentById).
- StudentServiceImpl: Implements StudentService and uses StudentRepository for data operations.

### Controller Layer:
- StudentController: Manages HTTP requests and responses, maps URLs to handler methods, processes data, and returns appropriate views.
- Dependency Injection: Uses constructor-based dependency injection for StudentService.

### Thymeleaf Integration:
- students.html: Displays a list of all students.
- create_student.html: Provides a form for adding new students.
- edit_student.html: Provides a form for editing existing students.

### User-Friendly Interface:
- Bootstrap: Ensures a responsive and user-friendly design with Bootstrap classes in HTML templates.

### Spring Boot Framework:
- Simplified Development: Eases the setup and development process with built-in features and configurations.
- Spring Data JPA: Simplifies data access and manipulation through JPA repositories.


## Tools and Technologies Used

- Java 16
- Spring Boot
- Spring MVC
- Spring Data JPA(Hibernate)
- MySql
- Thymeleaf
- Eclipse STS

## Installation Steps

1. Clone the repository to your local machine
2. Open Spring Tool Suite (STS), import the project as an "Existing Maven Project", and build it using Run As > Maven install.
3. Right-click the project in STS and select Run As > Spring Boot App, then access the app at http://localhost:8080/students.
