//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
//    }
//}

fun factorial(n: Int): Int {
    return if (n==1) {
        n
    } else {
        n * factorial(n - 1)
    }
}

/*
    Tail call recursion
 */
tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n-1, newResult)
    }
}




fun main() {
    println("factorial ${factorial(5)}")
}