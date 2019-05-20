const val TAVERNS_NAME = "Taeryn's Follis"

fun main(args: Array<String>) {
    placeOrder("shandy,DRAGON'S BREATH,5.91")
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERNS_NAME.indexOf('\'')
    val tavernMaster = TAVERNS_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")

    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)

    val phrase = if (name.toLowerCase() == "dragon's breath") {
        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name")}"
    } else {
        "Madrigal says: Thanks for the $name."
    }
    println(phrase)
}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value) {
            "a", "A" -> "4"
            "e", "E" -> "3"
            "i", "I" -> "1"
            "o", "O" -> "0"
            "u", "U" -> "|_|"
            else -> it.value
        }
    }