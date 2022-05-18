fun main() {
   manusia(30)
}

fun manusia(otak: Int): Int{
    val iq = otak
    if(iq >= 50){
        println("manusia pintar")
    }else{
        println("manusia kurang pintar")
    }
    return iq
}