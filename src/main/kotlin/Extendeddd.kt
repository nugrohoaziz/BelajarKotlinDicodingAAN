fun main() {
    10.cetakInt()
    10.tambahTiga()
    println(10F.potong)
}
//muali extension function
fun Int.cetakInt(){
    println(this)
}

//return value
fun Int.tambahTiga(): Int{
    val pertambahan = this + 3
    println(pertambahan)
    return pertambahan
}
//seleseai extended function

//mulai extended properties
val Float.potong : Float
    get() = this/ 3F
//selesai extended properties