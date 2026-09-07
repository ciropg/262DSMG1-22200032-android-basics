// Codelab: Cómo escribir condicionales en Kotlin
// Ejercicio "Ponlo a prueba": convertir la sentencia when en expresión
//
// Se agrega "Amber" con una coma, ya que en algunos países
// ese color cumple la misma función que el amarillo.
//
// La expresión when requiere la rama else: como debe devolver un
// valor, el compilador exige que las ramas sean exhaustivas.

fun main() {
    val trafficLightColor = "Amber"

    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }

    println(message)
}