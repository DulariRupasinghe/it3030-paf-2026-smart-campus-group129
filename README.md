````markdown
# Smart Campus Operations Hub

**Repository Name:** `it3030-paf-2026-smart-campus-group129`

Smart Campus Operations Hub is a campus management system created to improve the handling of facilities, resources, and notifications. It provides a single platform for students, staff, and administrators to manage important campus activities more efficiently.

This project was developed using:

- Backend: Spring Boot  
- Frontend: React + Vite  
- Database: MongoDB  

---

# Getting Started

Follow the steps below to run the project on your local machine.

---

# Requirements

Please make sure the following are installed:

- Java JDK 17 or above  
- Node.js (v18 or later)  
- npm  
- Apache Maven  
- MongoDB  

---

# Backend Setup

## Step 1: Open the backend folder

```bash
cd backend
````

## Step 2: Configure the database

Open the following file:

```text
src/main/resources/application.properties
```

Use this MongoDB connection:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/smartcampus
```

## Step 3: Run the backend

```bash
mvn clean install
mvn spring-boot:run
```

You can also open the backend in IntelliJ IDEA, Eclipse, or VS Code and run:

```text
SmartCampusApplication.java
```

## Backend URL

```text
http://localhost:8080
```

---

# Frontend Setup

## Step 1: Open the frontend folder

```bash
cd frontend
```

## Step 2: Install dependencies

```bash
npm install
```

## Step 3: Start the frontend

```bash
npm run dev
```

## Frontend URL

```text
http://localhost:5173
```

---

# Project Structure

```text
smart-campus-project/

├── backend/
│   ├── src/main/java
│   └── pom.xml

├── frontend/
│   ├── src/
│   └── package.json

└── README.md
```

---

# Main Features

## Resource Management

* Manage lecture halls, laboratories, classrooms, and equipment
* Add, update, view, and remove resources
* Track availability and status

## Notifications

* Send campus announcements
* Show updates to users in real time

## User Interface

* Responsive design
* Easy navigation

## Security

* JWT-based login and access control

---

# Sample API Endpoints

| Method | Endpoint             | Description         |
| ------ | -------------------- | ------------------- |
| GET    | /api/facilities      | View all facilities |
| POST   | /api/facilities      | Add a facility      |
| PUT    | /api/facilities/{id} | Update facility     |
| DELETE | /api/facilities/{id} | Delete facility     |
| GET    | /api/notifications   | View notifications  |
| POST   | /api/notifications   | Add notification    |

---

# Group Members

| Member   | Student ID |
| -------- | ---------- |
| Member 1 | IT23401044 |
| Member 2 | IT23400122 |
| Member 3 | IT23421080 |

---

# Note

This project was developed for the IT3030 Project Agile Framework (PAF) module.

---

# Thank You

```
```
