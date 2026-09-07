// Codelab: Usa la nulabilidad en Kotlin
// Tema: operador de aserción no nulo !!
//
// Con !! afirmas que la variable no es null, sea cierto o no.
// Si en realidad es null, lanza NullPointerException, que es un
// error de tiempo de ejecución (la app se cierra al ejecutarse).
//
// Por eso solo debe usarse cuando hay certeza de que no es null.

fun main() {
    val favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)

    // Descomentar la siguiente línea provoca NullPointerException:
    // val sinValor: String? = null
    // println(sinValor!!.length)
}