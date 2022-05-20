fun deteksiAir(air: Int, arus: Int, suhu: Int){
    if (air >= 50 && arus >= 40 && suhu <= 1){
        println("bahaya banjir karena $air  tinggi")
    }else{
        println("tidak banjir")
    }}

fun main() {
    deteksiAir(air = 90, arus = 98 , suhu = 9786)
}