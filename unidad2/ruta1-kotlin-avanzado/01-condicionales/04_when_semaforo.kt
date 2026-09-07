// Codelab: Cómo escribir condicionales en Kotlin
// Tema: sentencia when
// Se prefiere when sobre if/else cuando hay más de dos ramas,
// porque mejora la legibilidad.

fun main() {
    val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}
main()