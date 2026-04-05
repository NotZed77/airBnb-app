📘 **Project**
Airbnb Hotel System — This project provides API implementations for managing hotels, rooms, bookings, user creation, and guest management. The API is developed following clean code practices and SOLID principles.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<img width="948" height="718" alt="image" src="https://github.com/user-attachments/assets/9573be56-0b19-4a61-91f8-6798aded520f" />

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

✅ **Overview**
1. **Entities Defined**
 <img width="241" height="357" alt="image" src="https://github.com/user-attachments/assets/949a3c3a-788d-473b-9f7b-ef5cc34a9bb9" />

2. **Database Design**
   <img width="849" height="881" alt="image" src="https://github.com/user-attachments/assets/02040944-81a1-4838-abb1-18137256cebd" />

3. **REST API**
   <img width="1873" height="1058" alt="image" src="https://github.com/user-attachments/assets/d9509fcf-0f40-4fd2-920b-4be865313343" />

  <img width="1882" height="832" alt="image" src="https://github.com/user-attachments/assets/ac7d7543-6246-4893-a802-0f37819d9059" />

  <img width="1675" height="864" alt="image" src="https://github.com/user-attachments/assets/f4f0e4d1-d6ba-4078-8d52-5fd9f078b3c7" />

   - Implemented CRUD Operations for all entities.
   - Used Spring MVC Architecture to design the application.

4. **Security**
   - Implemented Spring Security for authentication and authorization.
   - Used JWT (JSON Web Tokens) for stateless session management.
   - Secured all REST endpoints with role-based access control.

5. **Configuration**
   - Used Stripe Web hook CLI and run the command to listen the payment status:
       stripe listen --forward-to localhost:8081/api/v1/webhook/payment

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

**Swagger URL**
- http://localhost:8081/api/v1/v3/api-docs
- http://localhost:8081/swagger-ui/index.html#/
- 
