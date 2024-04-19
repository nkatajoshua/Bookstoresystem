# Bookstoresystem
Simplified sample Project Structure 

springbookproject/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── bookstore/
│   │               └── springbookproject/
│   │                   ├── controller/
│   │                   │   └── BookController.java
│   │                   ├── entity/
│   │                   │   └── Book.java
│   │                   ├── repository/
│   │                   │   └── BookRepository.java
│   │                   └── service/
│   │                       └── BookService.java
│   └── test/
│       └── java/
│           └── com/
│               └── bookstore/
│                   └── springbookproject/
│                       ├── controller/
│                       │   └── BookControllerTest.java
│                       ├── service/
│                       │   └── BookServiceTest.java
│                       └── SpringbookprojectApplicationTests.java
└── pom.xml


IMPORTANCE
Authentication and Authorization:
Implement JWT-based authentication and authorization in JwtTokenUtil, JwtUserDetailsService, and SecurityConfig.
Controller and Service Layers:
Ensure separation of concerns by handling business logic in service classes (BookService, AuthorService, CategoryService) and exposing RESTful endpoints in controller classes (BookController, AuthorController, CategoryController).
Database Configuration:
Set up database connection and entity mappings in application.properties and entity classes (Book, Author, Category).
Error Handling:
Implement global exception handling using @ControllerAdvice to handle exceptions gracefully.

# Library Management System

## Project Setup
1. Clone the repository.
2. Configure database settings in `application.properties`.
3. Run the application using `./mvnw spring-boot:run` (Maven) or `./gradlew bootRun` (Gradle).

## Architecture
The application follows a layered architecture:
- Controller layer: Handles incoming HTTP requests.
- Service layer: Implements business logic.
- Repository layer: Interacts with the database using Spring Data JPA.

## Design Decisions
- Authentication and authorization implemented using Spring Security.
- RESTful API design adheres to industry best practices.
- H2 database used for development (configured in-memory).

## API Usage
### Books
- GET `/api/books`: Get all books.
- GET `/api/books/{id}`: Get book by ID.
- POST `/api/books`: Create a new book.
- DELETE `/api/books/{id}`: Delete book by ID.
