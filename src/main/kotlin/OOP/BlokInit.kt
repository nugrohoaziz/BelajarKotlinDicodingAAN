package OOP

fun main() {
    val tebakIniApa = BlokInit("Kijang", 40)
    println("ini adalah binatang ${tebakIniApa.pnama}, ayng berumur ${tebakIniApa.pumur}")
}

class BlokInit(nama: String, umur:Int){
    val pnama: String
    val pumur: Int

    init {
        pumur = if (umur < 9) {
            1
        } else {
            umur
        }

        pnama = if (nama == "Kijang") "Nama binatang ini adalah $nama" else "Cari tahu lagi"
    }
}


