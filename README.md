# Object-Oriented Programming - Week 1 Lab

Student Name: KHADIJA ABID

Seat Number: B25110006065

Section: B

Date: 25 July 2026

## Submission Contents

- `CarDemo`: enhanced Car class, driver program and matching UML.
- `CalculatorDemo`: calculator class, driver program and matching UML.
- `Documentation`: completed five-object worksheet, Laptop UML, stack/heap diagram, reflection, plan and viva answers.
- `SampleOutput.txt`: actual output from compiling and running both programs.

## How to Compile and Run

Open a terminal inside `CarDemo`:

```text
javac Car.java Main.java
java Main
```

Open a terminal inside `CalculatorDemo`:

```text
javac Calculator.java Main.java
java Main
```

## Main Design Choices

The Car has independent state for its brand, color, speed, fuel, gear, direction, engine and turbo mode. It cannot move while its engine is off or when it has no fuel. Speed never becomes negative, and stopping the engine resets the speed and gear.

The Calculator rejects division and modulus by zero. Its average and maximum operations use varargs and reject an empty list of values.
