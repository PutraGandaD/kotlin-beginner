//val summ: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }
val summ: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int) : Int {
    return valueA + valueB
}

fun isEvenNumber(number: Int) = number % 2 == 0
fun Int.isEvenNumberTwo() = this % 2 == 0

var messageTwo = "Kotlin"

fun main() {
    println(sum(20, 15))

    val numbers = 1.rangeTo(10)

    // Function References (::)
    val evenNumbers = numbers.filter(::isEvenNumber)
    val evenNumbersTwo = numbers.filter(Int::isEvenNumberTwo)

    println(evenNumbers)
    println(evenNumbersTwo)

    // Property References (::)
    println()
    println(::messageTwo.name)
    println(::messageTwo.get())

    ::messageTwo.set("Kotlin Academy")

    println(::messageTwo.get())
}