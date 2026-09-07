// Codelab: Usa la nulabilidad en Kotlin
// Tema: operador de llamada segura ?.
//
// Acceder con . directamente a una variable anulable da error de
// compilación, porque Kotlin aplica seguridad null.
// El operador ?. permite el acceso: si la variable es null,
// devuelve null en lugar de fallar.

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)   // 9

    favoriteActor = null
    println(favoriteActor?.length)   // null, el programa no falla
}