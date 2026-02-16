# 📚 Library Management System (Java + JDBC + Oracle)

A simple **Library Books Management System** built using **Core Java**, **JDBC**, and **Oracle Database**.  
This project allows students to register, books to be added, issued, and returned with proper database connectivity.

---

## 🚀 Features

✅ Student Registration  
✅ Add New Books  
✅ View Available Books  
✅ Issue Books to Students  
✅ Return Books  
✅ Update Book Status Automatically  
✅ Oracle Database Integration using JDBC  

---

## 🛠 Technologies Used

- **Java (Core Java)**
- **JDBC (Java Database Connectivity)**
- **Oracle Database (XE / SQL Developer)**
- **Eclipse IDE**
- **Git & GitHub**

---

## 📂 Project Structure

Library_Management_System/
│
├── src/
│ └── com/
│ ├── dao/ → Database operations (DAO classes)
│ ├── util/ → DB Connection utility
│ └── main/ → Main application (LibraryApp.java)
│
├── .gitignore

---

## 🗄 Database Tables Used

- `student_reg`
- `books`
- `issue_table`
- `return_table`

---

## ⚙ Setup Instructions

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/your-username/LibraryManagementSystem.git
2️⃣ Import Project into Eclipse

Open Eclipse

Click File → Import → Existing Projects into Workspace

Select the downloaded folder

Click Finish
3️⃣ Add Oracle JDBC Driver

Right click Project → Build Path → Configure Build Path

Click Libraries → Add External JAR

Select:
ojdbc8.jar or ojdbc11.jar
4️⃣ Update Database Credentials

Before running, open:

📌 src/com/util/www/DBConnection.java

Update your Oracle username and password:
String user = "your_username";
String password = "your_password";
5️⃣ Run the Project

Run the main class:

📌 LibraryApp.java
Right Click → Run As → Java Application
📌 Sample Menu Options
1. Register Student
2. Add Book
3. View Books
4. Issue Book
5. Return Book
6. Exit
👨‍💻 Author

Developed by Sai
📌 Java + Oracle JDBC Mini Project
