// Codelab: Tipos de funciones y expresiones lambda en Kotlin
// Tema: almacenar una función en una variable
//
// En Kotlin las funciones son construcciones de primera clase: se pueden
// tratar como un tipo de dato, guardarse en variables, pasarse como
// argumento y devolverse desde otras funciones.
//
// Para referirse a una función declarada con fun sin llamarla, se usa el
// operador de referencia de función ::
// Escribir "trick" sin :: da error, porque el compilador espera una llamada.
//
// Una expresión lambda define la función directamente, sin la palabra
// clave fun, y se guarda en la variable sin necesidad de ::

fun main() {
    val trickFunction = trick

    trick()           // se llama por el nombre de la variable
    trickFunction()   // se llama por la variable que la copió
}

// Versión con lambda: trick ahora es una variable, no un nombre de función
val trick = {
    println("No treats!")
}