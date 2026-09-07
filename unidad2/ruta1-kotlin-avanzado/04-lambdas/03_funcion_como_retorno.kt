// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: devolver una función desde otra función
//
// El tipo de retorno de trickOrTreat() es () -> Unit, o sea que la función
// no devuelve un valor común, sino otra función.
//
// Por eso trick() y treat() pueden ejecutarse sin haberlas llamado
// directamente: se guardó la función devuelta en una variable.

fun main() {
    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)

    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: () -> Unit = {
    println("Have a treat!")
}