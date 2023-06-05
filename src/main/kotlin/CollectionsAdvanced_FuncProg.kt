val numberTwo = listOf(1,2,3)

/*
    Fold
 */
val fold = numberTwo.fold(10) { current, item ->
    println("current $current")
    println("item $item")
    println()
    current + item
}

val foldRight = numberTwo.foldRight(10) { item, current ->
    println("current $current")
    println("item $item")
    println()
    item + current
}

fun main() {
    println("Fold result : $fold")
    println("Fold Right result : $foldRight")
}