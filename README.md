# Sandbox Project

A Spring Boot sandbox project for experimentation and learning.

## Overview

This project is a minimal Spring Boot application that serves as a sandbox environment for Java development. It includes a basic Spring Boot application setup and a standalone Hello World component to demonstrate logging functionality.

## Prerequisites

- Java 21
- Maven 3.6+
- Git (optional, for version control)

## Project Structure

```
sandbox/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── fma/
│   │   │       └── sandbox/
│   │   │           ├── SandboxApplication.java
│   │   │           └── helloworld/
│   │   │               └── Main.java
│   │   └── resources/
│   │       └── application.yml
│   └── test/
│       └── java/
│           └── fma/
│               └── sandbox/
│                   └── helloworld/
│                       └── MainTest.java
├── .gitignore
├── .gitattributes
├── pom.xml
└── README.md
```

## Getting Started

### Building the Project

```bash
# Clone the repository (if using Git)
git clone https://github.com/Florent-MARTIN/sandbox.git
cd sandbox

# Build with Maven
./mvnw clean install
```

### Running the Application

#### Spring Boot Application

```bash
./mvnw spring-boot:run
```

#### Standalone Hello World Application

```bash
java -cp target/sandbox-0.1.0-SNAPSHOT.jar fma.sandbox.helloworld.Main
```

### Using Dev Containers

#### Prerequisites for Dev Containers

- Docker Desktop
- Visual Studio Code
- Remote - Containers extension for VS Code

#### Opening the Project in a Dev Container

1. When prompted by VS Code, click "Reopen in Container" or use the command palette (F1) and select "Remote-Containers: Reopen in Container"

2. VS Code will build the dev container and open the project inside it. This may take a few minutes the first time.

#### Benefits of Using Dev Containers

- Consistent development environment across team members
- All required dependencies pre-installed
- Isolated from your local system
- No need to install Java, Maven, or other tools locally
- Works the same on Windows, macOS, and Linux

## Key Components

### Spring Boot Application

The project includes a standard Spring Boot application entry point in `SandboxApplication.java`.

### Hello World Component

A standalone Java application that demonstrates basic logging functionality using SLF4J.

## Dependencies

The project uses the following key dependencies:

- Spring Boot 3.4.4
  - spring-boot-starter (core Spring Boot)
  - spring-boot-starter-test (for testing)
- SLF4J for logging (via Spring Boot)

## Testing

The project includes JUnit 5 tests with Mockito for mocking.
