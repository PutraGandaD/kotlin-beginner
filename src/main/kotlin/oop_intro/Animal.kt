package oop_intro

//class Animal (val name: String,
//            val weight: Double,
//            val age: Int,
//            val isMammal: Boolean
//) {
//    fun eat() {
//        println("$name makan !")
//    }
//
//    fun sleep() {
//        println("$name tidur !")
//    }
//}

//class Animal {
//    var name: String = "Kucing Putra"
//        // override setter and getter
//        get() {
//            println("Fungsi getter terpanggil")
//            return field
//        }
//        set(value) {
//            println("Fungsi setter terpanggil")
//            field = value
//        }
//}

class Animal {
//    var name: String by DelegateName()
    var name: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
}

class Person {
    var name: String by DelegateName()
}

class Hero {
    var name: String by DelegateName()
}

fun main() {
//    val kucing = Animal("Buren", 3.0, 4, false)
//    println(kucing.name)
//    kucing.eat();
//    kucing.sleep()

//    val kucingPutra = Animal()
////    println("Nama : ${kucingPutra.name}")
//    kucingPutra.name = "Kucing putra"
//    println("Nama : ${kucingPutra.name}")

    val animal = Animal()
    animal.name = "Buren"
    animal.weight = 4.2
    animal.age = 2

    println("Nama hewan = ${animal.name}")
    println("Berat hewan = ${animal.weight}")
    println("Umur hewan = ${animal.age}")

//    val person = Person()
//    person.name = "Putra Ganda Dewata"
//    println("Nama Orang: ${person.name}")
//
//    val hero = Hero()
//    hero.name = "Spider-Man"
//    println("Nama Superhero: ${hero.name}")
}