package OOP

class MemBuatClass(val nama: String,
                   val weight: Double,
                   val age: Int,
                   val isSmall: Boolean) {

    fun eat(){
        println("$nama makan Snake")
    }

    fun sleep(){
        println("$nama silahkan tidur")
    }


}