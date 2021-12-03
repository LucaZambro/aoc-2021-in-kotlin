fun main() {
    fun part1(input: List<String>): Int {
        var count = 0

        var prev = 0
        input.forEach {
            if (prev != 0) {
                if (it.toInt() > prev)
                    count++
            } else prev = it.toInt()
            prev = it.toInt()
        }

        return count
    }

    fun part2(input: List<String>): Int {
        var count = 0

        val windows = input.windowed(3)
        var prevSum = 0
        windows.forEach { window ->
            val sum = window.sumOf { it.toInt() }
            if (prevSum != 0) {
                if (sum > prevSum)
                    count++
            }
            prevSum = sum
        }

        return count
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
