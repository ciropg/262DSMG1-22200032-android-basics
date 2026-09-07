// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: tipos de función anulables
//
// Para hacer anulable un tipo de función se encierra entre paréntesis y se
// agrega ? por fuera:  ((Int) -> String)?
//
// Ojo con la diferencia:
//   (Int) -> String?     devuelve un String que puede ser null
//   ((Int) -> String)?   la función completa puede ser null
//
// Antes de invocarla hay que hacer la verificación de null, igual que con
// cualquier otra variable anulable.

fun main() {
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val treatFunction = trickOrTreat(false, coins)
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