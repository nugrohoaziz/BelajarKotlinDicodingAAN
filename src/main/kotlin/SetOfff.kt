fun main() {
    val setA = setOf(1,2,3,5,6,2,4,2,1,2,3)
    val setB = setOf(1,2,3,4,5,6)
    println(setA == setB)
    println(5 in setA)

    val setC = setOf(1,3)
    val gabungan = setA.union(setC)
    println(gabungan)
    val irisan = setA.intersect(setC)
    println(irisan)

}