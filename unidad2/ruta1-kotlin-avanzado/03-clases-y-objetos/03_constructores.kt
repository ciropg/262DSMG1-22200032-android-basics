// Codelab: Usa clases y objetos en Kotlin
// Tema: constructores
//
// El constructor especifica cómo se crean los objetos de la clase.
//
// Constructor principal: se define en el encabezado de la clase y NO tiene
// cuerpo, por lo que no puede contener lógica. Solo puede haber uno.
//
// Constructor secundario: va dentro del cuerpo, sí admite lógica, y debe
// inicializar el constructor principal con : this(...). Puede haber varios.
//
// El constructor parametrizado elimina los valores codificados: antes todos
// los dispositivos se llamaban "Android TV".

class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    // Convierte el código de estado que devuelve una API externa
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {
    // Argumentos con nombre: evitan confundir el orden de dos String
    val smartTvDevice = SmartDevice(name = "Android TV", category = "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    // Uso del constructor secundario
    val smartLight = SmartDevice("Google Light", "Utility", 0)
    println("Device status is: ${smartLight.deviceStatus}")
}