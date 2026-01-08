# Task 2 – Spring Boot REST API with Swagger

## Description
This project is a REST API built with Spring Boot.
It provides CRUD operations for products and is documented using Swagger (OpenAPI).

All use cases are demonstrated using Swagger UI.

---

## How to run
1. Open the project in IntelliJ IDEA
2. Run `Task2ProjectApplication`
3. Open Swagger UI:  
   http://localhost:8080/swagger-ui/index.html

---

## API Documentation
Swagger OpenAPI definition:  
http://localhost:8080/v3/api-docs

---

## Use cases (Swagger)

### 1. Create product
**Endpoint:**  
POST `/api/products`

**Request body:**
```json
{
  "name": "Test product",
  "price": 99.99
}
