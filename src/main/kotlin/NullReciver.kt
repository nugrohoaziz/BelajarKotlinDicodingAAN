fun main() {
    println(4.slice)

    //
    println(0.slice)
    println(pembagianAngkaNol(10,0))

    val hasiliii: Int? = null
    println(hasiliii.slice2)
}

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)

fun pembagianAngkaNol(a: Int, b: Int): Int{
    if (b == 0){
        return 0
    }else{
        val hasil = a / b
        return hasil
    }
}


val Int?.slice2: Int
    get()=this?.div(2) ?: 0