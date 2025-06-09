---

# Advanced Encryption Standard (AES) File Encryption Tool

Axon Logo  
<p align="center">
  <img src="https://imgs.search.brave.com/kcAeeXLI6Acg1KHyaTQvg9da3a4o7pGvM2BWGGttsY0/rs:fit:500:0:0:0/g:ce/aHR0cHM6Ly9pbWdz/LnNlYXJjaC5icmF2/ZS5jb20vb3JnSWVX/TmE5U0owblhFeXJn/WFJ2bndLVVpSV2po/azVzelhHM1JwalEt/Yy9yczpmaXQ6NTAw/OjA6MDowL2c6Y2Uv/YUhSMGNITTZMeTkz/ZDNjdS9jR0YxWW05/NExtTnZiUzlvL2RX/Sm1jeTlYYUhrbE1q/QnAvY3lVeU1HVnVZ/M0o1Y0hScC9iMjRs/TWpCdlppVXlNRWhK/L1VFRkJKVEl3WTI5/dGNHeHAvWVc1MEpU/SXdaVzFoYVd4ei9K/VEl3YVcxd2IzSjBZ/VzUwL0pUSXdkRzhs/TWpCd2NtOTAvWldO/MEpUSXdaVkJJU1M1/cS9jR2M.jpeg" alt="AES Logo" width="200"/>
</p>

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Core Implementation Details](#core-implementation-details)
- [Project Structure](#project-structure)
- [Database Design](#database-design)
- [MySQL Table Creation](#mysql-table-creation)
- [JDBC Connection](#jdbc-connection)
- [Model & DAO Classes](#model--dao-classes)
- [User Interface](#user-interface)
- [Robustness & Error Handling](#robustness--error-handling)
- [Validation & Security](#validation--security)
- [Technologies Used](#technologies-used)
- [Run Instructions](#run-instructions)
- [Contribution & Testing](#contribution--testing)

---

## Overview

Axon is a high-performance command-line tool for securely encrypting and decrypting files, utilizing AES-128 encryption in CBC mode. Its focus is on providing robust security, fast processing, and an easy-to-use interface suitable for automation and cross-platform use.

---

## Features

- **AES-128 CBC Encryption & Decryption:** Industry-standard symmetric encryption to secure files.
- **Chunk Processing:** Handles files of any size efficiently by processing in chunks.
- **Secure Password & Key Management:** Enforces strong password validation and derives encryption keys securely.
- **Robust Error Handling:** Manages invalid inputs, file errors, and system failures gracefully.
- **Cross-Platform Support:** Compatible with Linux, macOS, and Windows.
- **CLI-Based Interface:** Simplifies automation and scripting.
- **Progress Indicators:** Shows processing progress for large files.

---

## Core Implementation Details

- **Modular Architecture:** Distributed across `model`, `dao`, `util`, and `ui` packages.
- **Encryption Process:** Uses Java's `javax.crypto` package with `AES/CBC/PKCS5Padding`.
- **File Chunking:** Processes large files efficiently without exhausting memory.
- **Error Handling:** Custom exceptions and validation wrap core logic for robustness.
- **Database Logging:** Tracks user actions or logs errors via MySQL database.

---

## Project Structure

```
project-root/
│
├── src/
│   ├── model/            # Entity classes (e.g., User)
│   ├── dao/              # Data Access Objects
│   ├── ui/               # User interface (CLI or GUI)
│   └── util/             # Utility classes (cryptography, DB connection)
│
├── database/
│   └── schema.sql        # Database schema
│
└── README.md
```

---

## Database Design

* Using MySQL to store users and logs.

**Example:**

```sql
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(100),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## MySQL Table Creation & JDBC Connection

- Create required tables using `schema.sql`.
- Configure your database credentials in `DBConnection.java`.
- Uses JDBC with try-with-resources for safe and efficient database interactions.

---

## Model & DAO Classes

- **Model Classes:** Represent database entities like `User`.
- **DAO Classes:** Provide CRUD methods (`addUser()`, `getUserById()`, etc.).
- **Separation of Concerns:** Keeps business logic decoupled from database operations.

---

## User Interface

- Built using **Swing** or **JavaFX** (select accordingly).
- Designed for clarity, consistency, and ease of navigation.
- Supports resizable windows, focus traversal, and keyboard shortcuts for accessibility.

---

## Robustness & Error Handling

- Comprehensive try-catch blocks prevent crashes.
- Custom exceptions indicate specific failure modes.
- Validation functions check for file existence, password strength, and input formats.
- User notifications and logs documented for troubleshooting.

---

## Validation & Security

- Enforces strong password policies.
- Checks file paths and user inputs before processing.
- Sanitizes inputs to prevent injection or access violations.
- Implements secure key derivation functions (e.g., PBKDF2).

---

## Technologies Used

- Java 17
- MySQL
- JDBC
- Swing / JavaFX
- IntelliJ IDEA / Eclipse
- Git & GitHub

---

## Run Instructions

1. Clone the repository.
2. Set up the MySQL database with the provided schema.
3. Update database credentials in the `DBConnection.java`.
4. Compile and run `Main.java`.
5. Use the CLI or GUI to encrypt or decrypt files conveniently.

---

## Contribution & Testing

- Ensure core features work correctly.
- Validate data inputs both client- and server-side.
- Handle errors gracefully with clear messages.
- Test large files and concurrent operations.
- Document new features and maintain code quality standards.

---
## Team Information
This project was developed by the SolutionMakers team.

Team Leader: Ujjalkant Kumar
Members: Harshit Kumar, Prabhat Kumar, Saurab Parihar
