fun main() {
    fun part1(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0

        input.map {
            val splitLine = it.split(" ")
            when(splitLine[0]){
                "forward" -> horizontalPosition += splitLine[1].toInt()
                "up" -> depth -= splitLine[1].toInt()
                "down" -> depth += splitLine[1].toInt()
                else -> {}
            }
        }

        return horizontalPosition*depth
    }

    fun part2(input: List<String>): Int {
        var horizontalPosition = 0
        var depth = 0
        var aim = 0

        input.map {
            val splitLine = it.split(" ")
            when(splitLine[0]){
                "forward" -> {
                    horizontalPosition += splitLine[1].toInt()
                    depth += (aim * splitLine[1].toInt())
                }
                "up" -> {
                    aim -= splitLine[1].toInt()
                }
                "down" -> {
                    aim += splitLine[1].toInt()
                }
                else -> {}
            }
        }

        return horizontalPosition*depth
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
