# Animal-Pet Java Project

## Description
This Java project demonstrates *object-oriented programming concepts* including:

- *Abstract classes*
- *Interfaces*
- *Inheritance*
- *Polymorphism*
- *Casting between objects*

The program defines different types of animals (Cat, Fish, Spider) and models pets with the Pet interface. It shows how different classes implement common behavior and override methods.

---

## Classes and Interfaces

### Abstract Class Animal
- legs – Number of legs of the animal
- Abstract method: eat()
- Concrete method: walk()

### Interface Pet
- Methods: getName(), setName(String name), play()

### Class Cat
- Extends Animal and implements Pet
- Overrides eat() and implements play()
- Inherits walk() from Animal

### Class Fish
- Extends Animal and implements Pet
- Overrides walk() (Fish cannot walk)
- Overrides eat() and implements play()

### Class Spider
- Extends Animal
- Overrides walk() and eat()

### Class MainQuize
- Contains the main() method
- Demonstrates:
  - Creating objects
  - Calling methods
  - Polymorphism
  - Object casting

---

## How to Run
1. Clone or download the repository.
2. Open terminal / command prompt and navigate to the project folder.
3. Compile the Java files:

```bash
javac *.java
