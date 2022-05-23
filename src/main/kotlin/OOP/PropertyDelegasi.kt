package OOP

import kotlin.reflect.KProperty

fun main() {
    val namaBinatang = animalaass()
    namaBinatang.name = "cicak"
    println("ini dalah ${namaBinatang.name}")
}

class DelegasiName {
    private var value: String = "default"

    operator fun getValue(classRef: Any?, property: KProperty<*>): String{
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String) {
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class animalaass{
    var name: String by DelegasiName()
}

//diatas delegasi code di atas menggunakan type properti string
//kita juga bisa menggunakan type data any
