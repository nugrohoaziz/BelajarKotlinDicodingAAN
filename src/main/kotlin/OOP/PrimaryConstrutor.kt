package OOP



fun main() {
    val binatang = Animalirls("sdjfoijsd", 8.3, 92, true)
    println("ini adalaha ${binatang.name}, yang beratbadannya ${binatang.weight}")
}

class Animalirls(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)