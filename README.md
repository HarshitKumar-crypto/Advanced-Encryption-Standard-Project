## Advanced-Encryption-Standard-Project
A high-performance, secure file encryption and decryption tool using AES-128.

<p align="center">
  <img src="https://imgs.search.brave.com/kcAeeXLI6Acg1KHyaTQvg9da3a4o7pGvM2BWGGttsY0/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly9pbWdz/LnNlYXJjaC5icmF2/ZS5jb20vb3JnSWVX/TmE5U0owblhFeXJn/WFJ2bndLVVpSV2po/azVzelhHM1JwalEt/Yy9yczpmaXQ6NTAw/OjA6MDowL2c6Y2Uv/YUhSMGNITTZMeTkz/ZDNjdS9jR0YxWW05/NExtTnZiUzlvL2RX/Sm1jeTlYYUhrbE1q/QnAvY3lVeU1HVnVZ/M0o1Y0hScC9iMjRs/TWpCdlppVXlNRWhK/L1VFRkJKVEl3WTI5/dGNHeHAvWVc1MEpU/SXdaVzFoYVd4ei9K/VEl3YVcxd2IzSjBZ/VzUwL0pUSXdkRzhs/TWpCd2NtOTAvWldO/MEpUSXdaVkJJU1M1/cS9jR2M.jpeg" alt="AES Logo" width="200"/>
</p>


## Table of Contents

* [Overview](#overview)
* [Features](#features)
* [Project Structure](#project-structure)
* [Database Design](#database-design)
* [MySQL Table Creation](#mysql-table-creation)
* [JDBC Implementation](#jdbc-implementation)
* [Model and DAO Classes](#model-and-dao-classes)
* [User Interface](#user-interface)
* [Responsiveness and Accessibility](#responsiveness-and-accessibility)
* [Technologies Used](#technologies-used)
* [Run Instructions](#run-instructions)

## Overview

Axon is a command-line tool that provides strong encryption and decryption capabilities using the Advanced Encryption Standard (AES-128) with Cipher Block Chaining (CBC) mode. It's designed for secure file protection with a focus on performance, security, and ease of use.


## Features

AES-128 Encryption: Industry-standard symmetric encryption algorithm
CBC Mode Implementation: Enhanced security through block chaining
Secure Password Handling: Strong password validation and key derivation
High Performance: Optimized C implementation for fast encryption/decryption
Command Line Interface: Simple, scriptable interface for automation
Cross-Platform Support: Works on Linux, macOS, and Windows
File Chunking: Efficiently handles files of any size by processing in chunks
Error Recovery: Robust error handling and reporting

---

## Project Setup

* **JDK Setup**: The project is built using **Java Development Kit (JDK 17)**.
* **IDE Used**: Developed and tested using **IntelliJ IDEA** / **Eclipse IDE**.
* Dependencies like JDBC driver are included in the project classpath.

## Project Structure

```
project-root/
│
├── src/
│   ├── model/
│   ├── dao/
│   ├── ui/
│   └── util/
│
├── database/
│   └── schema.sql
│
└── README.md
```

## Database Design

* The application uses **MySQL** for data storage.
* Database schema is designed to store necessary entities efficiently and supports normalization.

## MySQL Table Creation

Example SQL:

```sql
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## JDBC Implementation

* The project uses **JDBC API** for database connectivity.
* Connection is managed via a utility class (`DBConnection.java`).
* Secure access and closing of resources using try-with-resources blocks.

## Model and DAO Classes

* **Model Classes**: Represent entities like `User`.
* **DAO Classes**: Handle CRUD operations with methods like `addUser()`, `getUserById()`, etc.
* Implements separation of concerns by decoupling business logic and database operations.

## User Interface

* Built using **Swing / JavaFX** (update accordingly).
* Emphasis on **clean visual aesthetics** and intuitive navigation.
* UI is designed with consistency in color, typography, and spacing.

## Responsiveness and Accessibility

* UI components are aligned properly for a consistent layout.
* Resizable windows and scrollable content support basic responsiveness.
* Accessibility considerations include clear labels, focus order, and keyboard navigation.

## Technologies Used

* Java 17
* MySQL
* JDBC
* Swing / JavaFX
* IntelliJ IDEA / Eclipse
* Git & GitHub

## Run Instructions

1. Clone the repository.
2. Open the project in your IDE.
3. Set up the MySQL database and update connection details in `DBConnection.java`.
4. Run `Main.java` to start the application.

---


