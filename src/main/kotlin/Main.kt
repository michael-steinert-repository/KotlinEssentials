fun main() {
    /* Val Variables are not changeable */
    val name: String = "Michael"
    var age: Int = 27;
    println("$name is $age old.");

    val x: Double = 3.3; // Double
    val y: Long = 3L; // Long
    val z: Float = 3.3f; // Float
    val c: Char = 'a'; // Character
    val b: Boolean = true; // Boolean

    /* Method readLine() returns a nullable String (String?) */
    val userInput: String? = readLine();
    print(userInput);

    /* userInputAsString returns "0" if the Input is Null */
    val userInputAsString: String = readLine() ?: "0";
    val userInputAsInt: Int = userInputAsString.toInt();
    print(userInputAsInt);

    val todoList = listOf<String>("Todo1", "Todo2");
}