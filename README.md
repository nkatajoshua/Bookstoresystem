# Bookstoresystem
Simplified Project Structure following the implementation of CRUD

com.bookstore.springbookproject
├── controller
│   ├── BookController.java
│   ├── AuthorController.java
│   └── CategoryController.java
├── model
│   ├── Book.java
│   ├── Author.java
│   └── Category.java
├── repository
│   ├── BookRepository.java
│   ├── AuthorRepository.java
│   └── CategoryRepository.java
├── service
│   ├── BookService.java
│   ├── AuthorService.java
│   └── CategoryService.java
├── security
│   ├── JwtAuthenticationEntryPoint.java
│   ├── JwtRequestFilter.java
│   ├── JwtTokenUtil.java
│   └── JwtUserDetailsService.java
├── config
│   └── SecurityConfig.java
└── SpringBookProjectApplication.java

IMPORTANCE
Authentication and Authorization:
Implement JWT-based authentication and authorization in JwtTokenUtil, JwtUserDetailsService, and SecurityConfig.
Controller and Service Layers:
Ensure separation of concerns by handling business logic in service classes (BookService, AuthorService, CategoryService) and exposing RESTful endpoints in controller classes (BookController, AuthorController, CategoryController).
Database Configuration:
Set up database connection and entity mappings in application.properties and entity classes (Book, Author, Category).
Error Handling:
Implement global exception handling using @ControllerAdvice to handle exceptions gracefully.