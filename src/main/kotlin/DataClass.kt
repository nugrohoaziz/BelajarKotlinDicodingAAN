class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)



class User4(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User4

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main() {
    val orang = User("aziz",8)
    println(orang)

    val manusia = DataUser("agus", 10)
    val manusia2 = DataUser("agus", 10)
    val manusia3 = DataUser("agusi", 50)
    val manusia4 = manusia.copy()

    println(manusia4)
    println(manusia.equals(manusia2))
    println(manusia.equals(manusia3))
    println(manusia)

    val alien = User4("batman", 90)
    val alien2 = User4("batman", 90)
    val alien3 = User4("batmin", 80)
    println(alien.equals(alien2))
    println(alien.equals(alien3))


    //
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")

    //destruction Declarations
    val dataUser1 = DataUser("nrohmen2", 172)
    val (name2, age2) = dataUser1

    println("My name is $name2, I am $age2 years old")

    val mahasiswa1 = DesturctionDeclaration("nugroho", 19)
    mahasiswa1.perkenalanMahasiswa()
}