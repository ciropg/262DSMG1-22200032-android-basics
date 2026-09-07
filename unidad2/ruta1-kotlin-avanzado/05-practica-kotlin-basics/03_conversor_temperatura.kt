// Práctica: Conceptos básicos de Kotlin
// Ejercicio 3: Conversor de temperatura
// Conceptos aplicados: función de orden superior, lambdas, parámetro it,
//                      sintaxis lambda al final
//
// printFinalTemperature() recibe la fórmula como parámetro de tipo
// (Double) -> Double, así que una sola función sirve para las tres escalas.
//
// Las fórmulas usan valores Double (9.0 / 5.0 y no 9 / 5) para evitar la
// división entera, que truncaría el resultado a 1 en lugar de 1.8.

fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // dos decimales
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}