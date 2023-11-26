
# Project Employee Management System

This project involves the development of a web application for managing employees within a company. The application is built using JavaServer Faces (JSF) and Hibernate. The main functionalities include managing services, employees, and displaying relationships between employees and services.



## Project Structure
        1. Entities
In the entities package, you will find the following entities:

Employe: Represents an employee with attributes such as name, surname, date of birth, etc.
Service: Represents a service within the company.

        2. Services
In the services package, you will find:

AbstractFacade: An abstract generic class providing CRUD operations for any entity.
EmployeService: Extends AbstractFacade to provide specific CRUD operations for the Employe entity.
ServiceService: Extends AbstractFacade to provide specific CRUD operations for the Service entity.

        3. Web Pages
The web pages are located in the webapp directory:

manageServices.xhtml: Allows you to manage services.
addEmployee.xhtml: Provides a form to add an employee with information such as name, surname, date of birth, supervisor, service, and a photo upload.

        4. Collaborators Display
A functionality has been implemented to display the collaborators of a service, indicating the service manager and employees under their responsibility. PrimeFaces components have been utilized for a user-friendly interface.

        5. Employee Distribution Graph
A graph has been implemented to display the number of employees per service.
## How to Run the Application
1.Clone the repository.
2.Set up your Java development environment.
3.Configure your database settings in the hibernate.cfg.xml file.
4.Run the application on a server supporting JSF and Hibernate.
## Technologies Used
JavaServer Faces (JSF)
Hibernate
PrimeFaces
Java EE
## Screenshots

![App Screenshot](https://github.com/Naciri-Anas/WebApplication9/blob/main/Screemshot/Screenshot%202023-11-26%20211658.png?raw=true)

![App Screenshot](https://github.com/Naciri-Anas/WebApplication9/blob/main/Screemshot/Screenshot%202023-11-26%20211648.png?raw=true)

![App Screenshot](https://github.com/Naciri-Anas/WebApplication9/blob/main/Screemshot/Screenshot%202023-11-26%20213229.png?raw=true)
![App Screenshot](https://github.com/Naciri-Anas/WebApplication9/blob/main/Screemshot/Screenshot%202023-11-26%20212858.png?raw=true)


