fun main() {
    fun part1(input: List<Int>): Int {
        var firstValue = input.first()
        var counter = 0
        input.forEach {
            if(it > firstValue)
                counter++
            firstValue = it
        }
        return counter
    }

    fun part2(input: List<Int>): Int {
        var counter = 0
        for(i in 0..(input.size-4)){
            val compareFirst = input.slice(i..i+2).sum()
            val compareSecond = input.slice(i+1..i+3).sum()
            if(compareSecond > compareFirst)
                counter++
        }
        return counter
    }

    val input = readInput("Day01").map{ it.trim().toInt() }
    println("Part 1 : "+part1(input))
    println("Part 2 : "+part2(input))
}
