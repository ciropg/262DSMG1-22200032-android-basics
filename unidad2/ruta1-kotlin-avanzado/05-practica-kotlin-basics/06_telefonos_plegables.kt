// Práctica: Conceptos básicos de Kotlin
// Ejercicio 6: Teléfonos plegables
// Conceptos aplicados: herencia, open, override, argumentos predeterminados
//
// Hubo que agregar open en dos lugares del código inicial:
//   - antes de class Phone, para que pueda extenderse
//   - antes de fun switchOn(), para que pueda anularse
// En Kotlin todo es final por defecto.
//
// FoldablePhone anula switchOn() para que la pantalla solo encienda si el
// teléfono NO está plegado. switchOff() y checkPhoneScreenLight() se
// heredan sin cambios.

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = true) : Phone() {
    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
    }

    fun unfold() {
        isFolded = false
    }
}

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()            // plegado: no enciende
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unfold()
    newFoldablePhone.switchOn()            // desplegado: sí enciende
    newFoldablePhone.checkPhoneScreenLight()
}