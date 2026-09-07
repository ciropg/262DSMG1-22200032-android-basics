// Práctica: Conceptos básicos de Kotlin
// Ejercicio 7: Subasta especial
// Conceptos aplicados: llamada segura ?. y operador Elvis ?:
//
// bid?.amount ?: minimumPrice se lee así:
//   si bid no es null, devuelve bid.amount
//   si bid es null, devuelve minimumPrice
//
// Todo el ejercicio se resuelve en una línea. La alternativa con if/else
// ocuparía cuatro y haría exactamente lo mismo.

fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}