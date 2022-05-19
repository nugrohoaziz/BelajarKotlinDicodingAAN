fun main() {
    val listting = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listting){
       if (i == null) continue
       println(i)
    }

    for (a in listting){
        if (a == null) break
        println(a)
    }
}