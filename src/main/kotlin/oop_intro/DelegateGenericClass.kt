package oop_intro

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}