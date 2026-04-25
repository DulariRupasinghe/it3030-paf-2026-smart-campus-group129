````markdown
# Smart Campus Operations Hub

**Repository Name:** `it3030-paf-2026-smart-campus-group129`

Welcome to the **Smart Campus Operations Hub**. This project was developed to improve the way campus facilities, resources, and notifications are managed through one centralized system. It helps students, staff, and administrators handle day-to-day campus operations more efficiently.

The system was built using a modern full-stack approach:

- **Backend:** Spring Boot  
- **Frontend:** React + Vite  
- **Database:** MongoDB  

---

# How to Run the Project

Please follow the steps below to set up and run the system on your computer.

---

# Requirements

Before starting, make sure you have installed:

- Java JDK 17 or above  
- Node.js (v18 or later)  
- npm  
- Apache Maven  
- MongoDB  

---

# Backend Setup

### Step 1: Open the backend folder

```bash
cd backend
````

### Step 2: Configure MongoDB

Go to the following file:

```text
src/main/resources/application.properties
```

Use this connection string:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/smartcampus
```

(You can change this if using MongoDB Atlas.)

### Step 3: Run the backend

```bash
mvn clean install
mvn spring-boot:run
```

You can also run the backend using IDEs such as:

* IntelliJ IDEA
* Eclipse
* VS Code

Run the main file:

```text
SmartCampusApplication.java
```

### Backend URL

```text
http://localhost:8080
```

---

# Frontend Setup

### Step 1: Open frontend folder

```bash
cd frontend
```

### Step 2: Install packages

```bash
npm install
```

### Step 3: Run frontend

```bash
npm run dev
```

### Frontend URL

```text
http://localhost:5173
```

---

# Project Folder Structure

```text
smart-campus-project/

├── backend/              Spring Boot backend project
│   ├── src/
│   └── pom.xml

├── frontend/             React frontend project
│   ├── src/
│   └── package.json

└── README.md
```

---

# Main Features

### Facility Management

* Manage lecture halls, labs, classrooms, and other campus locations
* View available facilities easily

### Resource Management

* Add, update, delete, and manage equipment
* Track resource availability

### Notification System

* Send announcements to users
* Display important updates instantly

### User Authentication

* Secure login system using JWT

### User Interface

* Clean and responsive design
* Easy navigation for users

---

# Sample API Endpoints

| Method | Endpoint             | Purpose             |
| ------ | -------------------- | ------------------- |
| GET    | /api/facilities      | View all facilities |
| POST   | /api/facilities      | Add facility        |
| PUT    | /api/facilities/{id} | Update facility     |
| DELETE | /api/facilities/{id} | Delete facility     |
| GET    | /api/notifications   | View notifications  |
| POST   | /api/notifications   | Send notification   |

---

# Group Members

| Member   | Student ID |
| -------- | ---------- |
| Member 1 | IT23401044 |
| Member 2 | IT23400122 |
| Member 3 | IT23421080 |

---

# Submission Materials

The final submission includes:

* GitHub source code
* Final report
* Screenshots of system functions
* API testing results
* Running project demonstration

---

# Note

This project was created as part of the **IT3030 – Project Agile Framework (PAF)** module.

---

# Thank You

Thank you for reviewing our project.

```
```
