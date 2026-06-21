## How to Run

### 1. Install Requirements

Make sure you have:

* Java JDK 8 or later
* MySQL Server
* MySQL Connector/J (JDBC Driver)

### 2. Create Database

Open MySQL and run:

```sql
CREATE DATABASE mydb;

USE mydb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    marks DOUBLE
);
```

### 3. Configure Database Credentials

Open `Assignment_27.java` and update:

```java
private static final String url = "jdbc:mysql://localhost:3306/mydb";
private static final String username = "YOUR_USERNAME";
private static final String password = "YOUR_PASSWORD";
```

Replace:

* `YOUR_USERNAME` with your MySQL username
* `YOUR_PASSWORD` with your MySQL password

### 4. Add MySQL JDBC Driver

Download MySQL Connector/J and add the JAR file to your Java project's dependencies.

### 5. Compile the Program

```bash
javac Assignment_27.java
```

### 6. Run the Program

```bash
java Assignment_27
```

### 7. Enter Student Details

Example:

```text
Enter name : Rahul
Enter age : 21
Enter marks : 85.5
Enter more data(Y/N): Y

Enter name : Priya
Enter age : 22
Enter marks : 91.0
Enter more data(Y/N): N
```

The records will be inserted into the `students` table using JDBC Batch Processing.

## Expected Output

```text
Data Inserted Successfully!
```

or records will be added to the database without errors.

## Troubleshooting

### Driver Not Found

Make sure the MySQL Connector/J JAR is added to the project classpath.

### Access Denied

Verify your MySQL username and password.

### Database Not Found

Ensure the `mydb` database exists and MySQL Server is running.
