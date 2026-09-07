// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: sintaxis abreviada de las lambdas
//
// Tres abreviaciones, aplicadas en orden:
//
// 1. Parámetro implícito "it": si la lambda tiene un solo parámetro y no se
//    le pone nombre, Kotlin lo llama it y se omite la flecha ->
//        { quantity -> "$quantity quarters" }  ->  { "$it quarters" }
//
// 2. Lambda en línea: como la lambda es un literal de función (igual que 0
//    es un literal Int), puede pasarse directamente sin crear una variable.
//
// 3. Sintaxis lambda al final: si el último parámetro es un tipo de función,
//    la lambda se escribe FUERA del paréntesis de cierre.
//
// Esta última es la que ya se usa en Compose:
//        setContent { ... }   Surface(modifier = ...) { ... }

fun main() {
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true, null)

    treatFunction()
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