// Codelab: Cómo escribir condicionales en Kotlin
// Ejercicio "Ponlo a prueba": corrección de un error lógico
//
// Problema: con la rama else genérica, cualquier color distinto de
// rojo o amarillo imprimía "Go". Un semáforo apagado ("Black")
// le indicaba al conductor que avanzara.
//
// Solución: validar "Green" con un else if explícito y dejar el else
// para los casos no válidos.

fun main() {
    val trafficLightColor = "Black"

    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
    } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    }
}