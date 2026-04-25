# 🏛️ Smart Campus Operations Hub

Welcome to the **Smart Campus Operations Hub**, a comprehensive management system designed to streamline campus resource allocation and real-time notifications. This project is built using a modern stack featuring **Spring Boot** for the backend and **React (Vite)** for the frontend.

---

## 🚀 Getting Started

Follow these instructions to get the project up and running on your local machine.

### 📋 Prerequisites

Ensure you have the following installed:
- **Java 17 or higher** (JDK)
- **Node.js** (v18.x or later) & **npm**
- **Maven** (for backend dependency management)
- **MongoDB** (running locally on port `27017` or via cloud URI)

---

## 🛠️ Backend Setup (Spring Boot)

1. **Navigate to the backend directory:**
   ```bash
   cd backend
   ```

2. **Configure Database:**
   Update the `src/main/resources/application.properties` file with your MongoDB URI if it differs from the default:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/smartcampus
   ```

3. **Install Dependencies & Run:**
   Using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
   *Alternatively, import the project into your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code) and run the `SmartCampusApplication.java` file.*

4. **API Endpoint:**
   The backend server will start at `http://localhost:8080`.

---

## 💻 Frontend Setup (React + Vite)

1. **Navigate to the frontend directory:**
   ```bash
   cd frontend
   ```

2. **Install Dependencies:**
   ```bash
   npm install
   ```

3. **Start Development Server:**
   ```bash
   npm run dev
   ```

4. **Access the App:**
   Open your browser and navigate to `http://localhost:5173`.

---

## 📂 Project Structure

```text
smart-campus-project/
├── backend/            # Spring Boot REST API
│   ├── src/main/java   # Java source code
│   └── pom.xml         # Maven dependencies
├── frontend/           # React + Vite Application
│   ├── src/            # Components, Hooks, and Styles
│   └── package.json    # Frontend dependencies
└── README.md           # Project documentation
```

---

## ✨ Key Features

- **Resource Management:** Full CRUD operations for lecture halls, labs, and equipment.
- **Smart Notifications:** Real-time notification system for resource status updates.
- **Modern UI:** Responsive design with a professional green-themed aesthetic.
- **Secure Access:** JWT-based authentication (configured in backend).

---

## 👥 Group Members

| Member | Student ID |
| :--- | :--- |
| **Member 1** | IT23401044 |
| **Member 2** | IT23400122 |
| **Member 3** | IT23421080 |

---

## 📝 License

This project was developed as part of the **PAF (Project Agile Framework)** module.

