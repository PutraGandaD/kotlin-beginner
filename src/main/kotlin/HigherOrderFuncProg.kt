fun printResult(value: Int, sums: (Int) -> Int) {
    val result = sums(value)
    println(result)
}

var sums: (Int) -> Int = { value -> value + value }

val myLambdaFunc: (Int, Int) -> Int = { x, y -> x + y }

fun addTwoNum( a: Int, b: Int, myFunc: (Int, Int) -> Int ) {
    val result = myFunc(a,b)
    println(result)
}

fun main() {
    printResult(10, sums)
    addTwoNum(10, 5, myLambdaFunc)
}

