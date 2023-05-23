fun main() {
    // Kotlin Fundamental
    println("Hello Kotlin!")

    val names = "Putra Ganda Dewata"

    print("Hello, my name is ")
    println(names)
//    print(if (true) "Always true" else "Always false")

    /*
        Data Types and Variables
        Character, String, Array, Numbers, and Booleans

        var identifier: Type = initialization
     */

    // Introduction
    var firstName: String = "Putra "
    firstName = "Putra Ganda " // override
    println(firstName)

    val lastName: String = "Dewata " // val = final
    println(lastName)

    val company = "Dicoding" //type inference

    println(firstName + lastName + company)

    // Int (Integer)
    val valueA: Int = 20
    val valueB = 30
    println(valueA + valueB) //output 50

    // Char (Characters)
    val character = 'A' // type inference

    var vocal = 'A'
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    // String
    val text = "Kotlin"
    val firstChar = text[0] //indexing through String

    println("First character of $text is $firstChar")
    for (char in text) {
        println("$char")
    }

    val statement = "Kotlin is \"Awesome!\"" //Escaped String
    println(statement)

    var line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    println(line)

    // FUNCTION
    fun setUser(name: String, age: Int) : String {
        return "Your name is $name and you're $age years old"
    }
    println(setUser("Putra Ganda Dewata", 19))

    val user1 = setUser("Putra Ganda", 19)
    println(user1)

    // IF CONDITION
//    val openHours = 7
//    val now = 7
//    val officeClosed = 16
//    val office: String
//
//    if (now > openHours) {
//        office = "Office is still open!"
//    } else {
//        office = "Office is closed"
//    }

//    office = if (now > openHours) {
//        "Office is still open!"
//    } else {
//        "Office is closed"
//    }
//    println(office)
//
//    if (now > openHours) {
//        office = "Office is still open!"
//    } else if (now == openHours) {
//        office = "Wait for a moment 'til office opened"
//    } else {
//        office = "Office is closed"
//    }
//
//    println(office)

    // BOOLEAN
    val now = 20
    val officeClosed = 16
    val officeOpen = 7
//    val isOpen = if (now >= officeOpen && now <= officeClosed) {
//        true
//    } else {
//        false
//    }

    val isOpen = now > officeOpen
//    val isOpen = now >= officeOpen && now <= officeClosed
    val isClosed = now < officeOpen || now > officeClosed

    if (!isOpen) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

    println("Office is open : $isOpen")
    println("Office is closed : $isClosed")


    // NUMBERS
    val numberOne = 12
    val numberTwo = 6

    println(numberOne + numberTwo)
    println(numberOne / numberTwo)

    println(numberOne + numberTwo * 2)

    val doubleNumber: Double = 2.7
    val convertedDouble: Int = doubleNumber.toInt()
    println(convertedDouble)

    // ARRAYS
    val array = arrayOf(1, 3, 5, 7) //arrayOf = any data types

    val mixArray = arrayOf(1, 3, 5, 7, "Putra")

    val intArray = intArrayOf(1,3,5,7) // primitive array for Int

    println("Array arrayOf = ")
    for (list in mixArray) {
        println(list)
    }
    println(mixArray[4])
    mixArray[4] = "Putra Ganda Dewata"
    println(mixArray[4])

    // NULLABLE
    var testNull: String? = null //nullable
//    testNull = "Halo"

//    if (testNull != null) {
//        val testLength = testNull.length;
//        println(testLength)
//    } else {
//        println("Null detected!!!")
//    }

    println(testNull?.length) //safe call
    val testLength = testNull?.length ?: "Null!!!!" // Elvis operator

    println(testLength)










}

