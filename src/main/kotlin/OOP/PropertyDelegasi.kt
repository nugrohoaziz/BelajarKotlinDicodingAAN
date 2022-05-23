package OOP

import kotlin.reflect.KProperty

fun main() {
    val namaBinatang = animalaass()
    namaBinatang.name = "cicak"
    println("ini dalah ${namaBinatang.name}")

    val perkenalNenek = AniAni()
    perkenalNenek.name = "Siti Vina"
    perkenalNenek.age  = 90
    println("halo nama nenek adalah ${perkenalNenek.name}")
    println("halo nama nenek adalah ${perkenalNenek.age}")

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

class AnyDelegasi{
    private var values: Any = "Default"

    operator fun getValue(clasRef2: Any?, property2: KProperty<*>): Any{
        println("Fungsi ini sama seperti getter untuk properti ${property2.name} pada class $clasRef2")
        return values
    }
    operator fun setValue(classRef2: Any, property2: KProperty<*>, newValue2: Any) {
        println("Nilai ${property2.name} dari: $values akan berubah menjadi $newValue2")
        values = newValue2
    }
}

class AniAni{
    var name : Any by AnyDelegasi()
    var age : Any by AnyDelegasi()
}

