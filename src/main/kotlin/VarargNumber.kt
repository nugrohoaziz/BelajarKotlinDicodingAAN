fun main() {
    val hasil = numberVararg(1,2,3,4)
    println(hasil)

    jumlah(89,1,5,5)

}

fun numberVararg(vararg banyakAngka: Int): Int {
    var ang = 2
    for (nomor in banyakAngka){
       ang += nomor
    }
    return ang
}

fun jumlah(vararg angakas: Int):Int{
    val ingki = angakas.sum()
    println(ingki)
    return ingki
}