# Spring Framework Dependency Injection Example

This repository demonstrates the basics of **Spring Framework's Dependency Injection (DI)** with a simple example project. It showcases how to use Spring annotations like `@Component`, `@Autowired`, and `@Value` to manage and inject dependencies automatically.

## About the Project

The project simulates a scenario where a `Programmer` uses a `Computer` (either a `Desktop` or `Laptop`) to perform coding tasks. It is designed to illustrate key concepts in Spring's DI mechanism, including:
- Component scanning
- Bean lifecycle management
- Primary bean selection
- Value injection into fields
- Prototype bean scope

### Key Features
- **Annotation-Based Configuration**: Leverages annotations for defining and managing beans.
- **Decoupled Design**: Follows the principle of dependency injection to promote loose coupling.
- **Spring Boot Testing**: Includes unit testing with JUnit 5 for validating the setup.
