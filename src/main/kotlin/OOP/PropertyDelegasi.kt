package OOP

import kotlin.reflect.KProperty

fun main() {

    val animal1 = Animal()
    animal1.nameril = "Burung cemarah"
    println("hewan ini: ${animal1.nameril}")

}

class DelegateSetterNGetter {
    private var value: String = "Default"
    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}
class Animal {
    var nameril: String by DelegateSetterNGetter()
}

class Person {
    var name: String by DelegateSetterNGetter()
}

class Hero {
    var name: String by DelegateSetterNGetter()
}

