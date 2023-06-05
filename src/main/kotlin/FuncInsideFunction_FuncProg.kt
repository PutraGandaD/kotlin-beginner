fun setWord(message: String) {
//    fun printMessage(text: String) {
//        println(text)
//    }
    fun printMessage() {
        println(message)
    }

    printMessage(message)
}

fun sumInner(valueA: Int, valueB: Int, valueC: Int) : Int {
//    fun validateNumber(value: Int) {
//        if (value == 0) {
//            throw IllegalArgumentException("value must be better than 0")
//        }
//    }
//
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)

    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun main() {
    setWord("Halo")

    val sumInner = sumInner(valueC = 10, valueA = 11, valueB = 9)
    println(sumInner)
}