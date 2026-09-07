// Codelab: Cómo escribir condicionales en Kotlin
// Tema: condiciones complejas en when
//   coma (,) -> varios valores comparten el mismo cuerpo
//   in       -> rango de valores
//   is       -> verificación de tipo de dato

fun main() {
    val x: Any = 20

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}