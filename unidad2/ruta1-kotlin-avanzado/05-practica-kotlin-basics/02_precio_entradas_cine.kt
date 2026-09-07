// Práctica: Conceptos básicos de Kotlin
// Ejercicio 2: Precio de las entradas de cine
// Conceptos aplicados: expresión when con rangos (in), e if/else anidado
//
// La rama del precio estándar usa un if/else como expresión para aplicar
// el descuento de los lunes dentro de la misma rama del when.
//
// El -1 de la rama else marca un precio no válido. Lo ideal sería lanzar
// una excepción, tema de unidades posteriores.

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}