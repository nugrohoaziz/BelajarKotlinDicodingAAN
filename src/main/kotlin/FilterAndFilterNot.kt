fun main() {
    val numberlis = listOf(1,2,3,4,5,6,7,8,9,10)

    val yangBisaDiBagiDua = numberlis.filter { it % 2 == 0 }
    val yangTidakBisaDiBagiDua = numberlis.filterNot { it % 2 == 0 }
    println("$yangBisaDiBagiDua, $yangTidakBisaDiBagiDua")

    val multiplayBy5 = numberlis.map { it * 5 }
    println(multiplayBy5)


    println( numberlis.count())

    val list = (1..100).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

}