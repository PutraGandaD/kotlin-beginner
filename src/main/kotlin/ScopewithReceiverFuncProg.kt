fun main() {
    /*
        run
     */
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    /*
        with
     */
    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }
    val result3 = with(message) {
        "First char is ${this[0]}" +
                " and last char is ${this[this.length - 1]}"
    }
    println(result2)
    println(result3)

    /*
        apply
     */
    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message2.toString())
}