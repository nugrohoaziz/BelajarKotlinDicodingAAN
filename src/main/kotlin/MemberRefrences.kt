var pesansms = "Kotlin"
fun main() {
    val jarakAngkaSepuluh = 1..10
    val mencariAngka = jarakAngkaSepuluh.filter(::caraMencariBilanganGenanp)
    println(mencariAngka)

    //extension
    val mesinPencari = jarakAngkaSepuluh.filter(Int::howToFindOddNumber)
    println(mesinPencari)

    //properti reference
    println(::pesansms.name)
    println(::pesansms.get())
    ::pesansms.set("Kotlin Academy")
    println(::pesansms.get())
}

//member references for lamda
fun caraMencariBilanganGenanp(numbe: Int) = numbe % 2 == 0

//extension Function
fun Int.howToFindOddNumber() = this % 2 == 0


