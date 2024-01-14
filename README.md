# Task Manager Application

This is a simple console-based Task Manager application implemented in Java, following the principles of Clean Architecture. The application allows users to manage tasks by adding, viewing, marking as completed, and deleting tasks.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Features

- Add tasks with a title, description, and status.
- View a list of tasks.
- Mark tasks as completed.
- Delete tasks.

## Project Structure

The project follows the Clean Architecture principles, with the following key components:

- **Core:**
    - `entities`: Contains the domain entity, `Task`.
    - `usecases`: Contains the use cases, such as `TaskManagerUseCase`.

- **Infrastructure:**
    - **Delivery:**
        - `TaskManagerController`: Interface adapter for receiving requests from the user interface.

    - **Gateways:**
        - `TaskRepositoryGateway`: Interface adapter for communicating with external systems.

    - **Repositories:**
        - `InMemoryTaskRepository`: Implementation of the `TaskRepository` interface for in-memory storage.

- **Configuration:**
    - `TaskManagerConfig`: Configuration class for composing different components into a running system.

- **Main:**
    - `Main`: The entry point to the application.

## Getting Started

To run the Task Manager application, follow these steps:

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/task-manager.git
   ```

2. Navigate to the project directory:

    ```bash
   cd TaskManager/TaskManager/src/main/java/taskManager
   ```

3. Compile the java classes:

    ```bash
   javac -d out src/main/java/taskManager/TaskManagerMain.java 
   ```  

4. Run the application:

    ```bash
   java -cp out taskManager.TaskManagerMain 
   ```  

## Usage

- When the application starts, a simple menu will be displayed with options to add a task, view tasks, mark tasks as completed, or delete tasks.
- Follow the on-screen instructions to perform actions.

## Configuration 

The TaskManagerConfig class is responsible for configuring the application. You can customize dependencies, initialize components, or set up dependency injection in this class.