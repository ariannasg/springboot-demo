[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE.md)

# Demo app - Spring Boot Course

* [Description](#description)
* [Objectives](#objectives)
* [Steps taken to setup the project](#steps-taken-to-setup-the-project)
* [Run locally](#run-locally)
* [License](#license)

## Description
Build a demo web app using Spring by following the course https://www.linkedin.com/learning/learning-spring-with-spring-boot-2.

## Objectives
Learn Spring by creating a demo app using Spring Boot.

- Creating a project with Spring Initializr
- Examining a Spring Boot skeleton project
- Using embedded databases for Spring Boot development
- Building a service abstraction
- Using the IoC paradigm in Spring to develop a service layer
- Building a controller
- Testing a controller MockMvc
- Exposing a service layer through REST

## Steps taken to setup the project
- Created project at https://start.spring.io/
![Image of project config](spring-initializr.png)
- Added an [index.html](src/main/resources/static/index.html) file for testing that the configuration is correct:
    - Run [SpringbootDemoApplication.java](src/main/java/com/training/springbootdemo/SpringbootDemoApplication.java)
    - Visited http://localhost:8080/ 
- Added an embedded database using the Spring Data JPA and SQL files that will automatically run thanks to Spring Boot Autoconfiguration
- Created an entity object and a repository interface for the room table.
- Created a controller class for testing we could execute queries against our embedded database. 
ie: listing all the rooms in the database when requesting i.e: http://localhost:8080/rooms  
    
## Run locally
To run the app locally, execute the following command from the project root:
```
java -jar target/springboot-demo-0.0.1-SNAPSHOT.jar
```

## License
This project is licensed under the terms of the MIT License.
Please see [LICENSE](LICENSE.md) for details.
