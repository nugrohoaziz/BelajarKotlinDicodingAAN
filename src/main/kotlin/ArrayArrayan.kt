fun main() {
    val mixArrey = arrayOf(1,2,34,"jojo", "shinta")

    val numrun = arrayOf(1,2,3,4,5,6,7,9)
    numrun[3] = 6

    println(numrun[3])
    val intArray = Array(4, { i -> i * i })
    for(lamd in intArray){
        println(lamd)
    }
}