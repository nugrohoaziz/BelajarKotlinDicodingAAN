package OOP

class mobil(){
    var warna = "biru"

    get(){
        println("fungsi get untuk warna")
        return field
    }

    set(value){
        println("fungsi set untuk warna")
        field = value
    }
}


fun main() {
    val burung = MemBuatClass(nama = "perkutut", age = 89, isSmall = true, weight = 30.5)
    println("nama burung ini adalah ${burung.nama} umur ${burung.age} berat burung ini ${burung.weight} badan kecil ${burung.isSmall}")
    burung.eat()
    burung.sleep()

    val rental = mobil()
    rental.warna = "hitam"
    println("mobil kijang berwana ${rental.warna}")


    val getSet = mobil()
    println("ini warna asli ${getSet.warna}")
    getSet.warna = "coklat"
    println("ini warna setelah terganti")


}