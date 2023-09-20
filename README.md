# Kotlin Essentials

Kotlin is a statically-typed, general-purpose Programming Language designed to run on the Java Virtual Machine (JVM). As
an open-source Language, Kotlin skillfully merges object-oriented and functional Programming Paradigms

## Features of Kotlin

- **Java Interoperability**: Kotlin is fully interoperable with Java. The Kotlin Compiler translates Kotlin Source Files
  into Java Class Files, ensuring seamless Integration with Java Codebases
- **Multiplatform**: Kotlin can be used across various Platforms such as Linux, Windows, and even transpiled to
  JavaScript, streamlining Development and Maintenance across Platforms
- **Independence**: Kotlin is not tethered to the virtual Machine of any specific Target Platform
- **Core Features**:
    - **Null Safety**: Helps mitigate Issues related to Null Reference Exceptions
    - **Lambda Functions**: Anonymous Functions for concise Code
    - **Smart Casts**: Allows for intelligent Type Casting based on Context
- **Extensibility**: Kotlin offers Extension Functions, enabling Developers to add new Functionalities to existing
  Classes
  without Resorting to inheritance or design Patterns
- **Higher-Order Functions**: In Kotlin, Functions can be passed as Parameters, acting as Variables. These Functions can
  even be returned
- **Data Classes**: Simplifies the Creation of Classes intended mainly for Data Storage. Kotlin auto-generates common
  methods like `equals()`, `hashCode()`, and `toString()`

## Variables

- `var`: Mutable Variable whose Value can be changed
- `val`: Immutable Variable whose Value can not be altered after Assignment
- **Type Inference**: Kotlin can often infer the Type of Variable from its initial Assignment, removing the Need for
  explicit Type Declarations. However, explicit Types can still be provided if desired

## String Templates

Kotlin supports String Interpolation through String Templates. Variables or Expressions can be embedded directly into
Strings using the `$` Prefix

## Control Structures

- **Conditional Expressions**: The `if-else` Construct in Kotlin can also be used as an Expression, returning a Value
- **Switch Replacement**: The `when` Expression in Kotlin serves as a powerful Alternative to `switch` Statement in Java

## Null Safety

Kotlin emphasizes Null Safety to avoid Null Pointer Exceptions. To denote a Nullable Type, append `?` to the Type
declaration. By default, Kotlin Types are non-nullable
Example: `var name: String? = null`

## Threading

Threads in a Program operate sequentially. If one Thread encounters an Impediment, other Threads can continue Executing
the remaining Tasks

## Coroutines

Coroutines are "lightweight Threads" that offer a more efficient Way to handle Concurrency and asynchronous Operations

- **Suspendable**: Coroutines can pause and resume Execution without Blocking the underlying Thread
- **Key Features**:
    - **Launch**: Initiates a new Coroutine that operates concurrently
    - **Delay**: Suspends a Coroutine for a specified Time
    - **RunBlocking**: Starts a Coroutine and blocks the current Thread until its Completion

```kotlin
fun main() = runBlocking {
    launch {
        delay(4200L)
        println("Michael")
    }
    println("Name is ")
}
```

- **Coroutine Scope**: Allows for the Creation of custom Scopes. It suspends, rather than Blocking, and releases the
  underlying Threads
- **Job Management**: The **launch** Coroutine Builder returns a **Job** Object, Offering an explicit
  Way to manage Child Coroutine Completions
- **Suspending Functions**: Functions that can be paused and later resumed. These Functions can only be invoked within a
  Coroutine Context
