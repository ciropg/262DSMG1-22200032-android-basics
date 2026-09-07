// Codelab: Usa clases y objetos en Kotlin
// Tema: propiedades de clase
//
// Los métodos definen acciones; las propiedades definen características.
// Son variables declaradas en el cuerpo de la clase, no dentro de una función:
//   val -> propiedad inmutable
//   var -> propiedad mutable

class SmartDevice {

    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}