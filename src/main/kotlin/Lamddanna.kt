fun main() {
    message()
    iniPesan("haiii ak sedang belajar lamda")

    val mulaiPanjangPesan = panjangDariPesan("satu")
    println("ini adalah panjang dari kata satu $mulaiPanjangPesan ")
}

val message = { (println("halo ini lamda")) }


val iniPesan = {pesan: String -> println(pesan)}

val panjangDariPesan = {panjangPesan: String -> panjangPesan.length}