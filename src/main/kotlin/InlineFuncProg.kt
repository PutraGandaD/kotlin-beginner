fun main() {
    printedResult(10){ value ->
        value + value
    }
    printedResult(20){ value ->
        value + value
    }
}

inline fun printedResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}