private fun printInstructions() {
    println(
        """
                                       Tower of Hanoi Game                                
        Enter moves as "{from} {to}", where "from" and "to" are stack numbers (1, 2, or 3)
        Example: 1 3                                                                      
        ----------------------------------------------------------------------------------
        """.trimIndent()
    )
}

private fun getInput(): Move {
    while (true) {
        print("Enter move ({from} {to}): ")
        val input = readlnOrNull()?.trim()?.split(Regex("\\s+"))?.mapNotNull { it.toIntOrNull() }
        if (input?.size == 2 && input.all { it in 1..TowerOfHanoi.STACKS_AMOUNT }) {
            val (from, to) = input
            return Move(from - 1, to - 1)
        }
        println("Invalid input! Please enter a valid move")
    }
}

fun main() {
    printInstructions()

    print("Enter the number of disks or press Enter for the default amount of \"3\"): ")
    var disksAmount = readlnOrNull()?.toIntOrNull() ?: 3
    while (disksAmount < 1) {
        println("Invalid input! Please enter a positive number")
        disksAmount = readlnOrNull()?.toIntOrNull() ?: 3
    }
    val game = TowerOfHanoi(disksAmount)

    do {
        game.printState()
        while (!game.moveDisk(getInput())) {
            println("Invalid move! Please try again")
        }
    } while (!game.isComplete())

    game.printState()  // optional
    println("Congratulations! You have completed the Tower of Hanoi :)")
}
