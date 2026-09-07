// Codelab: Usa la nulabilidad en Kotlin
// Tema: verificación de null con sentencia if/else
//
// Dentro de la rama if, el compilador ya sabe que la variable no es
// null, así que se accede a length con el operador . directamente,
// sin ?. ni !!.
//
// Conviene sobre ?. cuando hay varias líneas que usan la variable.

fun main() {
    val favoriteActor: String? = "Sandra Oh"

    if (favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }
}