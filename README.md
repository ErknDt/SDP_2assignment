# SDP Assignment 2

## Factory Method & Abstract Factory

This project implements two creational design patterns:
- Factory Method
- Abstract Factory

## Part A — Factory Method

The Factory Method pattern is implemented using a transport system.

### Structure
- `Transport` — Product interface
- `Truck`, `Ship` — Concrete Products
- `TransportFactory` — Creator
- `TruckFactory`, `ShipFactory` — Concrete Creators

The factory method `createTransport()` is responsible for creating concrete transport objects.

## Part B — Abstract Factory

The Abstract Factory pattern is implemented using GUI components for different platforms.

### Structure
- `Button`, `Checkbox` — Abstract Products
- `WindowsButton`, `WindowsCheckbox` — Windows products
- `MacButton`, `MacCheckbox` — Mac products
- `GUIFactory` — Abstract Factory
- `WindowsFactory`, `MacFactory` — Concrete Factories
- `Application` — Client

Each concrete factory creates a consistent family of related GUI components.

## Technologies

- Java
- JDK 17
- IntelliJ IDEA

## Author

Kuat Allazhar Talgatuly
