// Práctica: Conceptos básicos de Kotlin
// Ejercicio 5: Perfil de Internet
// Conceptos aplicados: propiedades anulables y verificación de null
//
// hobby y referrer son de tipo anulable (String? y Person?) porque son
// campos opcionales del perfil.
//
// Dentro del if (referrer != null) se accede a referrer.name con el
// operador . directamente: el compilador ya sabe que no es null ahí.
//
// Se usa print() en vez de println() para armar la línea por partes, y
// "\n\n" al final para separar los perfiles.

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            print("Likes to $hobby. ")
        }
        if (referrer != null) {
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}.")
            } else {
                print(".")
            }
        } else {
            print("Doesn't have a referrer.")
        }
        print("\n\n")
    }
}