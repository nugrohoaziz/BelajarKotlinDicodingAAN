fun main() {
    val jarakAngkaSepuluh = 1..10
    val mencariAngka = jarakAngkaSepuluh.filter(::caraMencariBilanganGenanp)
    println(mencariAngka)
}

fun caraMencariBilanganGenanp(numbe: Int) = numbe % 2 == 0