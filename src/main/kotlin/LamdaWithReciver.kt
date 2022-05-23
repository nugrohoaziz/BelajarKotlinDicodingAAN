fun main() {
    val messagess = membangunKata {
        append("Hello ")
        append("from ")
        append("lambda ")
    }

    println(messagess)
}

fun membangunKata(aksi: StringBuilder.() -> Unit): String {
    val membuatKata = StringBuilder()
    membuatKata.aksi()
    return membuatKata.toString()
}