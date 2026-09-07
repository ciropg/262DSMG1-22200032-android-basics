// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: funciones de orden superior y repeat()
//
// Una función de orden superior es la que recibe funciones como parámetro
// o devuelve una función. trickOrTreat() lo es por partida doble: recibe
// ((Int) -> String)? y devuelve () -> Unit
//
// repeat() es una función de orden superior de la librería estándar:
//        repeat(times: Int, action: (Int) -> Unit)
//
// times  -> cuántas veces se ejecuta la acción
// action -> la función a ejecutar; su Int es el número de iteración
//           (0 en la primera, 1 en la segunda, etc.)
//
// Equivale a un bucle for, pero expresado con funciones. Como action es el
// último parámetro, se usa la sintaxis lambda al final.

fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)

    repeat(4) {
        treatFunction()
    }

    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}