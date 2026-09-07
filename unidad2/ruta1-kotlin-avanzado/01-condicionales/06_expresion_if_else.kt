// Codelab: Cómo escribir condicionales en Kotlin
// Tema: if/else como expresión
// La sentencia ejecuta acciones; la expresión produce un valor
// que se asigna a una variable. Así se evita repetir println().

fun main() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}