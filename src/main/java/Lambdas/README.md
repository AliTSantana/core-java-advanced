# Lambdas in Java

This module covers **Java Lambdas**, from basic usage to more advanced concepts like closures, custom functional interfaces, and higher-order functions.

---

## 📂 Basics

### 1. `FunctionalInterfaces.java`
- Demonstrates how lambdas work with **functional interfaces** (interfaces with exactly one abstract method).
- Shows how lambdas replace verbose anonymous classes for interfaces like `Runnable` (no return value) and `Callable` (returns a value).
- Key takeaway: Lambdas implement the interface’s single method directly, so no need for `@Override`.

### 2. `MethodReferences.java`
- Explains **method references** as a shorthand for lambdas when the method already exists.
- Covers three main types:
    - Static method references
    - Instance method references
    - Constructor references
- Method references improve readability and reduce boilerplate code.

### 3. `PredicateAndFunction.java`
- Demonstrates the use of Java’s built-in functional interfaces from `java.util.function`.
- Key concepts:
    - `Predicate<T>` → evaluates a condition, returns `true` or `false`.
    - `Function<T,R>` → transforms a value from one type to another.
    - `Consumer<T>` → consumes a value, performs an action without returning.
    - `Supplier<T>` → provides or generates values on demand.

---

## 📂 Advanced

### 1. `ClosuresAndScopes.java`
- Explains how lambdas **capture variables from their outer scope**.
- Rules:
    - Variables must be **effectively final** (cannot be modified after assignment).
    - Captured variables are remembered even after the method ends → this is called a **closure**.
- Key takeaway: Lambdas can “remember” values from their surrounding context.

### 2. `CustomFunctionalInterfaces.java`
- Shows how to define your own **functional interfaces** with `@FunctionalInterface`.
- Demonstrates using lambdas to implement your custom operations.
- Key benefit: Design domain-specific functional behaviors while keeping concise syntax.

### 3. `HigherOrderFunctions.java`
- Demonstrates **higher-order functions**, i.e., functions that take other functions as parameters or return functions.
- Enables building **reusable and composable behavior** using lambdas.
- Key takeaway: Lambdas and functional interfaces allow flexible pipelines of behavior in Java.
