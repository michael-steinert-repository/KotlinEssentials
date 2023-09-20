fun main(args: Array<String>) {
    // Val Variables are immutable
    // Data Types
    val x: Double = 3.3;
    val y: Long = 3L;
    val z: Float = 3.3f;
    val c: Char = 'a';
    val b: Boolean = true;

    // Method readLine() returns a nullable String (String?)
    val userInput: String? = readLine();
    print(userInput);

    // userInputAsString returns "0" if the Input is Null
    val userInputAsString: String = readLine() ?: "0";
    val userInputAsInt: Int = userInputAsString.toInt();
    print(userInputAsInt);

    val todoList = listOf<String>("Todo1", "Todo2");

    // String Templates and Expressions
    val name = "Michael"

    println("Hello $name and ${name.uppercase()}")

    // if else Statement as Expression
    val number1 = 21;
    val number2 = 42;

    val greaterNumber = if (number1 > number2) {
        number1
    } else {
        number2
    }
    println("Greater Number is $greaterNumber")

    // if else Statement
    val valueOfNumber = 5

    val selectedNumber = when (valueOfNumber) {
        4 -> "Number 4"
        else -> "Number not supported"
    }
    println("Selected Number is $selectedNumber")

    // Array
    val array1 = arrayOf(2, 4, 6, 8)
    val array2 = arrayOf(1, 3, 5, 7)

    // Set at Position the Value
    array1.set(3, 10)
    println("New Element is ${array1.get(3)}")

    for (element in array1) {
        println("Element of Array $element")
    }

    for (index in array2.indices) {
        println("Index of Array $index and Value ${array2[index]}")
    }

    // List
    val numberList = listOf<Int>(21, 42)
    var sum = 0

    numberList.forEach {
        sum += it
    }
    println("Sum of Array $sum")

    // Function
    println("Result of Function is ${addNumbers(1, 2)}")

    // Higher-order Function
    val multiplyNumbers = fun(number1: Int, number2: Int): Int {
        return number1 * number2;
    }
    println("Result of Higher-order Function is ${calculateNumber(1, 2, multiplyNumbers)}")

    // Lambda Function
    val printNumber = { number: Int -> println("Printed Number is $number") }
    printNumber(42)

}

private fun addNumbers(number1: Int, number2: Int): Int {
    return number1 + number2;
}

private fun calculateNumber(number1: Int, number2: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(number1, number2);
}