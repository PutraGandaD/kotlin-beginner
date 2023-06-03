fun main() {
    /*
    Extension Functions
     */
    10.printInt()
    println(10.plusThree())

    /*
    Extension Properties
     */

    var value: Int? = null
    println(value.slice)
}

/*
    Extension Functions
 */
fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

/*
    Extension Properties
 */
//val Int.slice: Int
//    get() = this / 2

val Int?.slice: Int
//    get() = if (this == null) 0 else this.div(2)
    get() = this?.div(2) ?: 0



