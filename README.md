<div align="center">
  <h1 align="center">Primavera Financial</h1>

  <p align="center">
    <a href="https://github.com/stashon/primavera-financial/issues">» submit a suggestion </a>
    ·
    <a href="https://github.com/stashon/primavera-financial/issues">» report a bug </a>
    ·
    <a href="https://github.com/stashon/primavera-financial">» contact </a>
  </p>

  <div align="center">

![GitHub forks](https://img.shields.io/github/forks/stashon/primavera-financial?style=social) ![GitHub stars](https://img.shields.io/github/stars/stashon/primavera-financial?style=social)

[![CI](https://github.com/stashon/primavera-financial/actions/workflows/push_on_main.yml/badge.svg)](https://github.com/stashon/primavera-financial/actions/workflows/push_on_main.yml)
![GitHub Pull Request (open)](https://img.shields.io/github/issues-pr/stashon/primavera-financial?color=blue) ![GitHub last commit](https://img.shields.io/github/last-commit/stashon/primavera-financial?color=pink) ![GitHub License](https://img.shields.io/github/license/stashon/primavera-financial?color=green) ![contributions welcome](https://img.shields.io/badge/contributions-welcome-purple.svg?style=flat)

  </div>
</div>

<details open="open">
  <summary><h2 style="display: inline-block">🕹 Table of Content</h2></summary>
  <ol>
    <li>
      <a href="#🌻-about">About</a>
      <ul>
        <li><a href="#🔧-tech-stack">Tech Stack</a></li>
        <li><a href="#🍄-features">Features</a></li>
      </ul>
    </li>
    <li>
      <a href="#🌵-documentation">Documentation</a>
      <ul>
        <li><a href="#🍯-setup">Setup</a></li>
        <li><a href="#🍎-development">Development</a></li>
      </ul>
    </li>
    <li><a href="#🌾-contributing">Contributing</a></li>
    <li><a href="#📜-license">License</a></li>
  </ol>
</details>

## :sunflower: About
**Primavera Financial** is a fullstack banking simulation. It provides a secure environment for users to manage accounts, transfer funds, and visualize transaction history.

#### :heavy_plus_sign: Backend
* **Java 17 (LTS):** Selected for its modern features (Records, Pattern Matching) and long-term stability in enterprise environments.
* **Spring Boot 3.2:** Provides rapid application development with auto-configuration and embedded server support.
* **Spring Security + JWT:** Implements stateless authentication using JSON Web Tokens, ensuring secure and scalable API access.
* **Spring Data JPA (Hibernate):** Abstraction layer for database interactions, reducing boilerplate SQL code.
* **Lombok:** Reduces verbosity by auto-generating getters, setters, and constructors.

#### :heavy_plus_sign: Frontend
* **React 18:** Component-based library for building a dynamic, reactive user interface.
* **TypeScript:** Adds static typing to JavaScript, preventing runtime errors and matching the strictness of the Java backend.
* **Tailwind CSS:** Utility-first CSS framework for rapid, responsive styling without context switching.
* **Vite:** Next-generation frontend build tool that significantly improves development server start times.
* **Axios:** Promise-based HTTP client for making asynchronous requests to the Spring Boot API.

#### :heavy_plus_sign: Data & Infrastructure
* **PostgreSQL:** Robust, open-source relational database chosen for its ACID compliance and reliability in financial applications.
* **H2 Database:** In-memory database used for local development and testing to ensure rapid iteration cycles.
* **Docker:** Containerization platform ensuring the application runs consistently across different environments.

#### :heavy_plus_sign: DevOps & Quality Assurance
* **Maven:** Dependency management and build automation tool for the Java backend.
* **JUnit 5 & Mockito:** Frameworks for unit and integration testing to ensure high code coverage and reliability.
* **GitHub Actions:** CI/CD pipeline that automatically builds the project and runs tests on every push to the main branch.

### :mushroom: Features

#### :heavy_plus_sign: Core Banking
- [x] **ACID Compliant Transfers:** Atomic credit/debit transactions between accounts.
- [x] **Real-time Dashboard:** View current balance and recent activity.
- [x] **Transaction History:** Immutable logs of all financial movements.

#### :heavy_plus_sign: Security
- [x] **JWT Auth:** Stateless login system with secure token storage.
- [x] **Role-Based Access:** Distinct views for User vs. Admin.
- [x] **Input Validation:** Backend (`@NotNull`) and Frontend (Formik/Yup) validation.

## :cactus: Documentation

### :honey_pot: Setup
To run this project, you need **Java 17+**, **Node.js**, and **Maven**.

1.  **Clone the repo**
    ```sh
    git clone [https://github.com/stashon/primavera-financial.git](https://github.com/stashon/primavera-financial.git)
    cd primavera-financial
    ```

2.  **Start the Backend (Spring Boot)**
    ```sh
    # In one terminal
    cd backend
    mvn spring-boot:run
    ```
    *Server will start on `http://localhost:8080`*

3.  **Start the Frontend (React)**
    ```sh
    # In a second terminal
    cd frontend
    npm install
    npm run dev
    ```
    *UI will launch on `http://localhost:5173`*

### :apple: Development

## :ear_of_rice: Contributing
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

> 1. Fork the Project
> 2. Create your Branch (`git checkout -b feature/AmazingFeature`)
> 3. Commit your Changes (`git commit -m 'feat: Add some AmazingFeature'`)
> 4. Push to the Branch (`git push origin feature/AmazingFeature`)
> 5. Open a Pull Request

## :pencil: License
Distributed under the MIT License. See `LICENSE` for more information.
This project is licensed under [LICENSE](https://opensource.org/licenses).
