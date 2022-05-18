fun main() {
    val user = setUser("nug", 19)
    println(user)

    printUser("kijang123")

}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(namalengkap: String){
    println("nama kamu siapa $namalengkap")
}