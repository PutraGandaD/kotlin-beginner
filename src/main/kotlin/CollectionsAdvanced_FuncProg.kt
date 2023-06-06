val numberTwo = listOf(1,2,3)
val numberThree = listOf(1, 2, 3, 4, 5, 6)
val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //index 0 to 9
val textt = listOf("A", "B", "CC", "DDDD", "EEE", "FF", "G")

data class Itemz(val key: String, val value: Any)

val items = listOf(
    Itemz("1", "Kotlin"),
    Itemz("2", "Language"),
    Itemz("2", "Kotlin"),
    Itemz("2", "Kotlin"),
    Itemz("2", "Kotlin"),
    Itemz("3", "is awesome")
)

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

    /*
        Drop
     */
    val drop = numberThree.drop(3)
    println("Drop first = $drop")

    val dropp = numberThree.dropLast(3)
    println("Drop Last = $dropp")

    /*
        Take
     */
    val take = total.take(3)
    println("Take first = $take")

    val takee = total.takeLast(4)
    println("Take Last = $takee")

    /*
        Slice
        number = (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        array indexing (start from 0)
     */
    val slice = total.slice(4..9) // index start from 0
    println("Slice = $slice")

    val slicee = total.slice(3..9 step 3)
    println("Slice with step = $slicee") // step 3

    val index = listOf(1, 4, 7, 8)
    val sliceee = total.slice(index)
    println("Slice with index(as a argument) = $sliceee")


    /*
        Distinct
     */
    val totalvariant = listOf(1,1,1,2,2,5,7,8,5,6,1,3,5,8,5,8,8,4,4,6)
    val distinct = totalvariant.distinct()

    println("Distinct = $distinct")

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val distinctt = textt.distinctBy {
        it.length
    }

    println(distinctt)

    /*
        Chunked
     */
    val word = "PUTRAA"
    val chunked = word.chunked(3)
    val chunkedTransform = word.chunked(3) {
        it.toString().lowercase()
    }

    println(chunked)
    println(chunkedTransform)
}