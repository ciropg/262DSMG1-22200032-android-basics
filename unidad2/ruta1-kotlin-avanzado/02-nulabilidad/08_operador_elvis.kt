// Codelab: Usa la nulabilidad en Kotlin
// Tema: operador Elvis ?:
//
// Hace lo mismo que el archivo anterior, pero de forma más idiomática.
// Si la expresión de la izquierda no es null, se usa su valor.
// Si es null, se usa el valor de la derecha como predeterminado.
//
// Se llama Elvis porque de costado parece el copete de Elvis Presley.

fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}