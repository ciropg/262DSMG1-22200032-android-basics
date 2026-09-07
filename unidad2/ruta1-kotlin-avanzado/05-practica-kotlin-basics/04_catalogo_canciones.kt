// Práctica: Conceptos básicos de Kotlin
// Ejercicio 4: Catálogo de canciones
// Conceptos aplicados: clase con constructor principal, propiedad con
//                      función get personalizada, método
//
// isPopular no guarda ningún valor propio: se calcula cada vez que se lee,
// a partir de playCount. Por eso lleva get() y no un valor asignado.
//
// El guion bajo en 1_000_000 es solo separador visual, Kotlin lo ignora.

fun main() {
    val brunoSong = Song("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}