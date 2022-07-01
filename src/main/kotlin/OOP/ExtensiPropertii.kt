package OOP

fun main() {

    val binatangInfo = Anomil("gajah", 34,89,"")
    println(binatangInfo.getAnomilInfo3)

}

class Anomil(var nama23: String, var beratBadan: Int, var umur: Int, var isMamamal: String)

val Anomil.getAnomilInfo3 : String
get() = "nama binatang ini adalah ${this.nama23}, berat bada binatang ini adalah ${this.beratBadan}, umur dari binatang ini adalah ${this.umur}"

