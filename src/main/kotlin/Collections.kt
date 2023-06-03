import kotlin.streams.toList

fun main() {
    /*
        LIST
     */

    val numberList = listOf(1, 2, 3, 4, 5)

    //val anyList = listOf('a', "Kotlin", 3, true)
    val anyList = mutableListOf('a', "Kotlin", 3, true)

    println(anyList)
    println(anyList[1])

    //changes to anyList (mutableListOf)
    anyList.add('d')
    println(anyList[4])
    anyList.add(0, "Aaa")
    println(anyList)
    anyList[4] = false
    anyList.removeAt(0)
    println(anyList)

    /*
        SET
     */
    println()

    val SetA = setOf(1, 2, 4, 1, 1, 1, 9, 5, 4, 10, 13)
    val SetB = setOf(1, 2, 3, 1, 4, 15, 9, 5, 4, 10, 13)
    println(SetA)
    println(SetB)
    println(SetA == SetB)
    println(9 in SetB)

    val union = SetA.union(SetB)
    val intersect = SetA.intersect(SetB)
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1,2,4,2,2,5)
    mutableSet.add(8)
    mutableSet.remove(2)
    println(mutableSet)

    /*
        MAP
     */

    // key ----> value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "New York" to "USA",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital["Amsterdam"])
//    println(capital.getValue("Amsterdam"))

    val capitalList = capital.keys
    println(capitalList)

    val countryList = capital.values
    println(countryList)

    // to mutable (not suggested)
    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)

    /*
        Collections Operations
     */
    println()

    // filter and filternot
    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numbersList.filter { it % 2 == 0 }
    println(evenList)

    val notEvenList = numbersList.filterNot { it % 2 == 0 }
    println(notEvenList)

    // map()
    val multipliedBy10 = numbersList.map { it * 10 }
    println(multipliedBy10)

    // count()
    println(multipliedBy10.count())
    print(numbersList.count { it % 3 == 0 })

    // find(), firstOrNull(), lastOrNull()
    val firstOddNumber = numbersList.find { it % 2 == 1 }
    val firstOrNullNumber = numbersList.firstOrNull { it % 2 == 3 }
    println(firstOddNumber)
    println(firstOrNullNumber)

    // first() & last()
    val moreThan10 = numbersList.first { it > 0 }
    println(moreThan10)

    // sum()
    val total = numbersList.sum()
    println(total)

    // sorted()
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() //ascending
    val descendingSort = kotlinChar.sortedDescending() //descending
    println(ascendingSort)
    println(descendingSort)

    /*
        Sequences
     */
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(8).forEach { print("$it") }






}