// Codelab: Usa la nulabilidad en Kotlin
// Tema: if/else como expresión para convertir un tipo anulable
//       en uno no anulable
//
// lengthOfName queda de tipo Int (no anulable), porque ambas ramas
// devuelven un valor: length si hay nombre, 0 como predeterminado.

fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}