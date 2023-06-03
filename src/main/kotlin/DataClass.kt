class User(val Name: String, val age: Int)

data class DataUser(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

fun main() {
//    val user = User("putra", 17)
//    val dataUser = DataUser("putra", 17)
//
//    println(user)
//    println(dataUser)

    val dataUser = DataUser("putra", 17)
    val dataUser2 = DataUser("putra", 18)
    val dataUser3 = DataUser("ganda", 19)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age=19)

    println(dataUser4)
    println(dataUser5)

//    val name = dataUser.component1()
//    val age = dataUser.component2()
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")

    val dataUserOne = DataUser("Putra Ganda Dewata", 19)
    dataUserOne.intro()
}