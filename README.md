
# Bookstore System

This is a Spring Boot application for managing a bookstore system, providing functionalities for managing books, authors, categories, orders, and user authentication.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup Instructions](#setup-instructions)
- [API Documentation](#api-documentation)
- [Usage](#usage)
- [Contributing](#contributing)


## Features

- CRUD operations for Books, Authors, Categories, and Orders.
- User registration, authentication, and role-based access control (RBAC) using Spring Security and JWT.
- Secure endpoints for user management and order management.
- Pagination, filtering, and search functionality for books, authors, and categories.
- Error handling and validation for user inputs.
- Versioning of APIs to handle backward compatibility.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA (Hibernate)
- MySQL (for production)
- Maven (for dependency management)


## Project Structure

The project follows a standard Spring Boot project structure:

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── bookstore/
│   │           ├── controller/       # RESTful API controllers
│   │           ├── service/          # Business logic services
│   │           ├── repository/       # Data access repositories
│   │           ├── config/           # Configuration classes (e.g., SwaggerConfig)
│   │           ├── entity/           # JPA entities (e.g., Book, Author)
│   │           └── SpringbookprojectApplication.java  # Main application class
│   └── resources/
│       ├── application.properties    # Application configuration
│       ├── data.sql                  # Sample data for development
│       └── schema.sql                # Database schema definition
└── test/
    └── java/
        └── com/
            └── bookstore/
                ├── controller/       # Unit and integration tests for controllers
                └── service/          # Unit tests for services
```

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/nkatajoshua/Bookstoresystem.git
   ```

2. **Navigate to the project directory:**

   ```bash
   cd Bookstoresystem
   ```

3. **Build the application:**

   ```bash
   mvn clean package
   ```

4. **Run the application:**

   ```bash
   java -jar target/springbookproject-0.0.1-SNAPSHOT.jar
   ```

5. **Access the application:**

   Open a web browser and go to `http://localhost:8080`

## API Documentation

The API documentation is generated using Swagger. After starting the application, access the Swagger UI at `http://localhost:8080/swagger-ui/index.html` to view detailed documentation of the RESTful API endpoints.

## Usage

- Use the API endpoints documented in Swagger to interact with the bookstore system.
- Perform CRUD operations on books, authors, categories, and orders.
- Register users, authenticate, and manage user roles.


```bash
mvn test
```

## Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-xyz`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-xyz`).
5. Create a new Pull Request.

