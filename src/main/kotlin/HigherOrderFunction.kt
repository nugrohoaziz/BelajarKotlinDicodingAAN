fun main() {
    val hasil = sum2(4)
    println(hasil)

    printRusultHasil(90, sum6)
}

var sum2: (Int) -> Int = { valuees1 -> valuees1 + valuees1 }

//hight order function
fun printRusultHasil(valueiu: Int, sum6: (Int) -> Int){
    val resuttslt = sum6(valueiu)
    println(resuttslt)
}

var sum6: (Int) -> Int = { nilai24 -> nilai24 + nilai24 }