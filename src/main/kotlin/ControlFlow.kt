fun main() {
    // Enumeration
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
//    val colorBlue = Color.BLUE
    val color: Color = Color.valueOf("RED")

    //println(Color.RED.value)
    //println(colorBlue.printValue())
    //println(colorRed.printValue())
//
//    for (color in Color.values()) { // values() Syntethic methods
//        println(color.value)
//    }
//
//    println(Color.GREEN.value)
//    println("Color is $color")
//    println("Color is ${color.printValue()}")
    println(color)

    when(color) {
        Color.RED -> println("I'm Red")
        Color.GREEN -> println("I'm groot")
        Color.BLUE -> println("I'm blue")
        else -> println("Nope! Try again.")
    }

    /*
       EXPRESSION AND STATEMENT
     */
    println()

    // IF AS A STATEMENT
    val openOffice = 7
    var now = 8
//    if (now > openOffice )
//        println("Office already open")
//    else
//        println("Office close")

    // IF AS A EXPRESSION or TERNARY(in java)
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    println(sum(1, 9))

    val value = 7


    /*
    While and Do While
     */

    println()
    // While
//    var counter = 7
//    while (counter <= 7) {
//        println("Hello, World!")
//        counter++
//    }

    // Do-While
    var counter = 1
    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)


    /*
     Range
     */
    println()
//    val rangeInt = 1..10 step 3
    val rangeInt = 1.rangeTo(10) step 3
    val downInt = 10.downTo(1) step 2
//    rangeInt.forEach {
//        print("$it")
//    }
    for (i in rangeInt) {
        print(i)
    }

    println()
    for (i in downInt) {
        print(i)
    }

    println()
    if (7 in rangeInt) {
        println("7 is in range")
    }

    if (11 !in downInt) {
        println("11 isn't in range")
    }

//    println(rangeInt.step) // get step value

//    val ranges = 1..5


    /*
        FOR / FOR-EACH
     */
    println()
    val ranges = 1.rangeTo(10) step 2
    for (i in ranges) {
        println("value is $i!")
    }

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    //for-each
    ranges.forEach { value ->
        println("value is $value!")
    }

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }

    /*
        BREAK AND CONTINUE
     */
    println()
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
//        if (i == null) continue
        if (i == null) break
        println(i)
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5 ) break@loop
        }
    }
}

fun sum(value1: Int, value2: Int) = value1 + value2

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
            println("value of RED is ${value.toString(16)}")
        }
                  },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
                    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()

}