# RideWise 

RideWise is a simplified **console-based Ride-Sharing System** inspired by platforms like Uber and Ola.
This project demonstrates strong **Low-Level Design (LLD)** concepts using Java and showcases proper implementation of:

* Strategy Pattern
* Composition over Inheritance
* SOLID Principles
* Low Coupling & High Cohesion
* Law of Demeter
* Clean Layered Architecture

The goal of this project is **not to build a production-ready ride-booking app**, but to demonstrate structured object-oriented design thinking.

---

#  Features

RideWise supports the following functionality:

* Rider can request a ride
* Driver is matched dynamically
* Multiple driver matching strategies supported
* Multiple fare calculation strategies supported
* Ride lifecycle tracking implemented
* Unique ID generation for riders, drivers, and rides
* Exception handling when no drivers are available
* Modular and extensible architecture

---

#  Design Patterns Used

## Strategy Pattern

The Strategy Pattern is used to dynamically change behavior at runtime.

Applied in:

### Ride Matching Strategy

Examples:

* NearestDriverStrategy
* LeastActiveDriverStrategy

Allows switching driver allocation logic without modifying RideService.

### Fare Calculation Strategy

Examples:

* DefaultFareStrategy
* PeakHourFareStrategy

Allows flexible fare calculation logic.

---

# 📐 SOLID Principles Applied

## 1. Single Responsibility Principle (SRP)

Each class has only one responsibility.

Examples:

* RiderService manages riders
* DriverService manages drivers
* RideService manages ride lifecycle
* FareStrategy handles fare calculation

---

## 2. Open Closed Principle (OCP)

Classes are open for extension but closed for modification.

Example:

New strategies can be added like:

* NightFareStrategy
* PremiumDriverStrategy

without modifying RideService.

---

## 3. Liskov Substitution Principle (LSP)

All strategy implementations can replace their base interface safely.

Example:

RideMatchingStrategy can be replaced with:

* NearestDriverStrategy
* LeastActiveDriverStrategy

without affecting behavior.

---

## 4. Interface Segregation Principle (ISP)

Separate interfaces created for separate responsibilities:

* RideMatchingStrategy
* FareStrategy

instead of a large monolithic interface.

---

## 5. Dependency Inversion Principle (DIP)

RideService depends on abstractions instead of implementations:

RideMatchingStrategy
FareStrategy

This enables loose coupling and flexible architecture.

---

#  Object Relationships

| Relationship             | Type        |
| ------------------------ | ----------- |
| Rider → Ride             | Association |
| Driver → Ride            | Association |
| Ride → FareReceipt       | Composition |
| RideService → Strategies | Composition |

Explanation:

Ride owns FareReceipt lifecycle.
If Ride is removed, FareReceipt is also removed.

---

#  Ride Lifecycle

Ride passes through the following states:

REQUESTED
MATCHED
STARTED
COMPLETED
CANCELLED

This lifecycle ensures complete trip tracking.

---

#  Project Structure

```
RideWise/
│
├── src/
│   └── com/
│       └── airtribe/
│           └── ridewise/
│               ├── Main.java
│               │
│               ├── model/
│               │   ├── Rider.java
│               │   ├── Driver.java
│               │   ├── Ride.java
│               │   ├── FareReceipt.java
│               │   └── RideStatus.java
│               │
│               ├── strategy/
│               │   ├── RideMatchingStrategy.java
│               │   ├── NearestDriverStrategy.java
│               │   ├── LeastActiveDriverStrategy.java
│               │   ├── FareStrategy.java
│               │   ├── DefaultFareStrategy.java
│               │   └── PeakHourFareStrategy.java
│               │
│               ├── service/
│               │   ├── RiderService.java
│               │   ├── DriverService.java
│               │   └── RideService.java
│               │
│               ├── exception/
│               │   └── NoDriverAvailableException.java
│               │
│               └── util/
│                   └── IdGenerator.java
│
└── docs/
    ├── Requirements.md
    ├── Class_Model.md
    ├── SOLID_Reflection.md
    └── Object_Relationships.md
```

---

# ⚙️ How to Run the Project

## Step 1: Compile

Run inside project root:

```
javac src/com/airtribe/ridewise/Main.java
```

## Step 2: Execute

```
java com.airtribe.ridewise.Main
```

---

#  Sample Output

Example console output:

```
Driver assigned: Bob
Ride started
Ride completed. Fare: 110.0
```

---

#  Extensibility

This system is designed to be easily extended.

Possible improvements:

* Add distance-based pricing
* Add driver location tracking
* Add cancellation workflow
* Add rider ratings
* Add driver ratings
* Add database persistence
* Convert into REST API backend
* Add real-time driver availability updates

---

#  Learning Outcomes

This project demonstrates understanding of:

* Strategy Pattern
* SOLID Principles
* Composition over Inheritance
* Object Modeling
* Ride lifecycle management
* Service-layer architecture
* Exception handling design
* Clean package structuring

---

#  Author

Developed as part of a Low-Level Design (LLD) assignment to demonstrate scalable system design principles in Java.
