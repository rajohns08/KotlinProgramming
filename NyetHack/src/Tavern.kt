fun main(args: Array<String>) {
    var beverage = readLine()

    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that.")
    }
    val beverageServed = beverage ?: "Buttered Ale"
    println(beverageServed)
}