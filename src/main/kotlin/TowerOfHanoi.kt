data class Move(val from: Int, val to: Int)

class TowerOfHanoi(private val disksAmount: Int) {
    companion object {
        const val STACKS_AMOUNT = 3
    }

    private val stacks = List(STACKS_AMOUNT) { mutableListOf<Int>() }

    init {
        stacks.first().addAll(disksAmount downTo 1)
    }

    private fun String.center(width: Int, filler: String = " "): String {
        val padding = (width - length) / 2
        return filler.repeat(padding) + this + filler.repeat(padding - (length + 1) % 2)
    }

    private fun diskToString(diskSize: Int?): String {
        val disk = diskSize?.let { "█".repeat((it - 1) * 2 + 1) } ?: "│"
        return disk.center(disksAmount * 2)
    }

    fun printState() {
        println() // optional, for better readability
        for (diskNum in (disksAmount - 1) downTo 0) {
            println(stacks.joinToString(" ") { diskToString(it.getOrNull(diskNum)) })
        }
        println((1..STACKS_AMOUNT).joinToString(" ") { "┴".center(disksAmount * 2, "─") })
        println((1..STACKS_AMOUNT).joinToString(" ") { it.toString().center(disksAmount * 2) })
    }

    private fun isValidMove(move: Move): Boolean =
        stacks[move.from].isNotEmpty() && (
                stacks[move.to].isEmpty() || stacks[move.from].last() < stacks[move.to].last()
                )

    fun moveDisk(move: Move): Boolean = isValidMove(move).also {
        if (it) {
            stacks[move.to].add(stacks[move.from].removeLast())
        }
    }

    fun isComplete(): Boolean = stacks.last().size == disksAmount
}
