fun main() {
    sKata("ini adalah function inside")

    println(ditambah(10,0))
}


fun sKata(pesan: String){
    fun cteakKata(tulisan :String){
        println(tulisan)
    }

    cteakKata(pesan)
}

//iner function
fun ditambah(valueH: Int, valueO: Int):Int{
    fun validasiNumber(values: Int){
        if (values == 0){
            throw IllegalArgumentException("values must be better than 0")
        }
    }

    validasiNumber(valueH)
    validasiNumber(valueO)

    return valueH + valueO
}