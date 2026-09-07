// Codelab: Usa clases y objetos en Kotlin
// Temas: definir una clase, crear una instancia y definir métodos
//
// La clase es el plano; el objeto es lo que se construye a partir de él.
// Las funciones declaradas dentro del cuerpo de una clase se llaman métodos.
// Convención: el nombre de la clase va en PascalCase.

class SmartDevice {
    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}