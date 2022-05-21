fun main() {
    println(tambah(8,8))
    println(keliling)
    val lusa = tambah.invoke(89,1)
    println(lusa)
    val pertambah = sum?.invoke(89,78)
    println(pertambah)
}

typealias aliasa1 = (Int,Int) -> Int

val tambah: aliasa1 = {valuee1, valuee2 -> valuee1 + valuee2}
val perkalian: aliasa1 = {value3, value4 -> value3 * value4}
val keliling = tambah.invoke(90,10)

typealias Arithmetic = ((Int, Int) -> Int)?
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }