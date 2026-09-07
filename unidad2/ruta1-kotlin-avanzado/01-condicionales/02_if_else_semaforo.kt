// Codelab: Cómo escribir condicionales en Kotlin
// Tema: sentencia if / else if / else

fun main() {
    val trafficLightColor = "Yellow"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else {
        println("Go")
    }
}