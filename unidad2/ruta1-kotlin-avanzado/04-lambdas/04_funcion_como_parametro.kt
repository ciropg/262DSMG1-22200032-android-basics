// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: pasar una función como argumento
//
// extraTreat es un parámetro de tipo (Int) -> String: recibe una función.
// Al declarar un tipo de función, los parámetros no llevan nombre, solo tipo.
//
// En la lambda, los nombres de parámetro van después de la llave de
// apertura y se separan del cuerpo con una flecha ->
//
// Las lambdas NO admiten la palabra clave return: el valor devuelto es el
// resultado de la última expresión del cuerpo.

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    // El parámetro no se usa, así que puede omitirse junto con la flecha
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, cupcake)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}