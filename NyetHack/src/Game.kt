fun main(args: Array<String>) {
    val name = "Madrigal"
    val healthpoints = 89
    var isBlessed = true
    val isImmortal = false

    // Aura
    val auraColor = auraColor(isBlessed, healthpoints, isImmortal)

    val healthStatus = formatHealthStatus(healthpoints, isBlessed)

    // Player status
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireball(numFireballs = 3)
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition"
        in 90..99 -> "has a few scratches"
        in 75..89 -> if (isBlessed) {
            "has some minor wounds, but is healing quite quickly"
        } else {
            "has some minor wounds"
        }
        in 15..74 -> "looks pretty hurt"
        else -> "is in awful condition"
    }


private fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
    println("(Aura: $auraColor)" + " " + "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean) =
    if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun castFireball(numFireballs: Int = 2): Int {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    if (numFireballs < 0) {
        return 0
    } else if (numFireballs > 50) {
        return 50
    } else {
        return numFireballs
    }
}

private fun inebriationStatus(inebriationValue: Int): String {
    val inebriationStatus = when (inebriationValue) {
        in 1..10 -> "tipsy"
        in 11..20 -> "sloshed"
        in 21..30 -> "soused"
        in 31..40 -> "stewed"
        in 41..50 -> "..t0aSt3d"
        else -> "n/a"
    }
    return inebriationStatus
}