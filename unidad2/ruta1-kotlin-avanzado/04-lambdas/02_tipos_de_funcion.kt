// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: el tipo de dato de una función
//
// Sintaxis:  (parámetros) -> tipo de retorno
//
//   () -> Unit          función sin parámetros que no devuelve nada
//   (Int, Int) -> Int   toma dos Int y devuelve un Int
//   (Int) -> String     toma un Int y devuelve un String
//
// Unit es el tipo que indica ausencia de valor de retorno.
// Kotlin infiere el tipo solo, pero aquí se declara de forma explícita.

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()
    treat()
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}