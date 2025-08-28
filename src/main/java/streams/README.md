# Streams Examples in Core Java

This folder contains example classes to demonstrate the most commonly used **Streams API features** in modern Java (Java 24). Each class includes a `main` method that can be executed directly.

---

## 1. StreamCreation.java

**Purpose:** Demonstrates different ways to create streams.

**Key Concepts:**

* **From a List:** Creates a stream from a `List` of elements.
* **From an Array:** Creates a stream from an array.
* **Stream Builder:** Uses a builder to create a custom stream element by element.
* **Infinite Stream:** Generates a theoretically infinite sequence of elements, limited in this example to prevent endless loops.

---

## 2. StreamOperations.java

**Purpose:** Demonstrates common **intermediate and terminal stream operations**.

**Key Functions:**

* **`map`** → Transforms each element in the stream (e.g., convert to uppercase).
* **`filter`** → Selects elements that satisfy a condition.
* **`distinct`** → Removes duplicate elements.
* **`sorted`** → Sorts elements in natural or custom order.
* **`reduce`** → Aggregates elements into a single value (e.g., concatenation or sum).

---

## 3. CollectorsExamples.java

**Purpose:** Shows how to **collect, aggregate, and transform stream data** using modern Java features and collectors.

**Key Functions:**

* **`toList()`** → Collects stream elements into an **immutable list** (Java 16+).
* **`toUnmodifiableSet()`** → Collects unique elements into an **immutable set**.
* **`joining()`** → Concatenates all stream elements into a single `String` with a separator.
* **`count()`** → Returns the number of elements in the stream.
* **`groupingBy()`** → Groups elements by a classifier function (e.g., string length).
* **`partitioningBy()`** → Splits elements into two groups based on a predicate (true/false).
* **`groupingBy + mapping`** → Combines grouping and transformation in a single step (e.g., uppercase elements grouped by length).

### ParallelStreams.java
**Purpose:** Demonstrates sequential vs parallel stream processing and compares execution time.


**Key Concepts:**
- `stream()` → sequential processing (single thread).
- `parallelStream()` → parallel processing using multiple threads.
- Shows how parallel streams can speed up processing for large or expensive computations.

### CustomCollector.java
**Purpose:** Demonstrates a **custom collector** for more complex accumulation.


**Key Concepts:**
- Accumulate elements in **custom data structures** (e.g., `Map<Character, Set<String>>`).
- Can **transform** elements during accumulation (e.g., uppercase).
- Combiner is required for parallel streams, but can be simplified for sequential streams.
- Useful when standard collectors (`toList()`, `joining()`) are insufficient