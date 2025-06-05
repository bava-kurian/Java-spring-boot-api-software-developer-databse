# CRUD Operations in Spring Boot

## What is CRUD?

CRUD is an acronym for **Create, Read, Update, and Delete**. These are the four basic operations used to manage persistent data in applications. In database systems and API development, CRUD represents the essential functions needed for data manipulation.

## CRUD in REST APIs

In RESTful APIs, CRUD operations typically map to HTTP methods as follows:

| Operation | HTTP Method | Description                          | Example Endpoint              |
|-----------|-------------|--------------------------------------|-------------------------------|
| Create    | POST        | Create a new resource                | `POST /software-engineers`    |
| Read      | GET         | Retrieve resource(s)                 | `GET /software-engineers/{id}`|
| Update    | PUT/PATCH   | Update an existing resource          | `PUT /software-engineers/{id}`|
| Delete    | DELETE      | Remove a resource                    | `DELETE /software-engineers/{id}`|

## Spring Boot CRUD Implementation

This repository demonstrates how to implement CRUD operations in a Spring Boot application with the following features:

- RESTful API endpoints
- Database persistence (JPA/Hibernate)
- Proper request/response handling
- Validation
- Exception handling
- Unit testing

## Getting Started

### Prerequisites
- Java JDK 11+
- Maven 3.6+
- Your favorite IDE (IntelliJ, Eclipse, VS Code)
- Optional: Docker (for containerized database)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-boot-crud-demo.git
   ```
2. Navigate to project directory:
   ```bash
   cd spring-boot-crud-demo
   ```
3. Build the project:
   ```bash
   mvn clean install
   ```

### Running the Application
```bash
mvn spring-boot:run
```

The application will start on port 8080 by default.

## API Documentation

Once the application is running, you can access:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- H2 Console (if using in-memory DB): `http://localhost:8080/h2-console`

## Example Requests

### Create a Software Engineer
```bash
curl -X POST \
  http://localhost:8080/api/software-engineers \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Jane Doe",
    "email": "jane@example.com",
    "skills": ["Java", "Spring Boot"],
    "yearsOfExperience": 5
  }'
```

### Get All Software Engineers
```bash
curl -X GET http://localhost:8080/api/software-engineers
```

### Update a Software Engineer
```bash
curl -X PUT \
  http://localhost:8080/api/software-engineers/1 \
  -H 'Content-Type: application/json' \
  -d '{
    "name": "Jane Smith",
    "email": "jane.smith@example.com",
    "skills": ["Java", "Spring Boot", "Docker"],
    "yearsOfExperience": 6
  }'
```

### Delete a Software Engineer
```bash
curl -X DELETE http://localhost:8080/api/software-engineers/1
```

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── demo/
│   │               ├── controller/   # REST controllers
│   │               ├── model/        # Entity classes
│   │               ├── repository/   # Data repositories
│   │               ├── service/      # Business logic
│   │               └── DemoApplication.java
│   └── resources/
│       ├── application.properties    # Configuration
│       └── data.sql                 # Initial data (optional)
├── test/                            # Test classes
```

## Technologies Used

- Spring Boot 2.7.x
- Spring Data JPA
- H2 Database (or MySQL/PostgreSQL)
- Lombok (for boilerplate code reduction)
- MapStruct (for DTO mapping)
- Swagger (API documentation)
- JUnit 5 & Mockito (testing)

## Best Practices Implemented

1. Proper layered architecture (Controller-Service-Repository)
2. DTO pattern for request/response
3. Input validation
4. Global exception handling
5. Proper HTTP status codes
6. Pagination for GET all endpoints
7. API versioning
8. Comprehensive logging

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
