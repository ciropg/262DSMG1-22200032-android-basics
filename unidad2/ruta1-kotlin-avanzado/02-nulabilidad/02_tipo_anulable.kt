// Codelab: Usa la nulabilidad en Kotlin
// Tema: tipos anulables y no anulables
//
// String  -> no anulable, no puede contener null
// String? -> anulable, puede contener null
//
// El operador ? al final del tipo es lo que permite asignar null.
// Sin él, el compilador infiere un tipo no anulable.

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}