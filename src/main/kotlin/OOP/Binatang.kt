package OOP

fun main() {
    val burung = MemBuatClass(nama = "perkutut", age = 89, isSmall = true, weight = 30.5)
    println("nama burung ini adalah ${burung.nama} umur ${burung.age} berat burung ini ${burung.weight} badan kecil ${burung.isSmall}")
    burung.eat()
    burung.sleep()
}