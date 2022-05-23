fun main() {
    val numberres = listOf(1,2,3,4)

    val fold = numberres.fold(10){angakaAwal, item ->
        println("current $angakaAwal")
        println("item $item")
        println()
        angakaAwal + item
    }

    println("hasil folld $fold")
}


