val message = { println("Hello from lambda!") }

// lambda expression with parameter
val printMessage = { message: String -> println(message) }

val messageLength = { message: String -> message.length }

fun main() {
    message()
    printMessage("Hello from the other side")

    val length = messageLength("Hello, it's me")
    println("Message length = $length")
}