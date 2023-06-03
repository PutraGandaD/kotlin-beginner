fun main() {
    /*
    Named Argument
     */
    val fullName = getFullName(middle = "Ganda", first = "Putra", last = "Dewata")
    val fullWord = getWord(first = "Swift/Apple")
    println(fullName)
    println(fullWord)

    /*
        Vararg (Variable Argument)
     */
    println()
    val numbers = sumNumbers(100, 200, 50, 30)
    println(numbers)

    // Vararg with Generic function
    val lists = asList('a', 'b', 'c', 'd')
    println(lists)



}

fun getFullName(first: String, middle: String, last:String) : String {
    // part of Named Argument
    return "$first $middle $last"
}

fun getWord(
   first: String = "Kotlin",
   middle: String = " is ",
   last: String = "Awesome") : String {
    // part of Named Argument
    return "$first $middle $last"
}

fun sumNumbers(vararg number: Int) : Int {
    // part of vararg (variable argument)
    return number.sum()
}

fun <T> asList(vararg input: T): List<T> {
    // part of vararg (Generic function)
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}
