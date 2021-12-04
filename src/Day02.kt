fun main() {
    fun submarinePart1(input: List<String>): Int {
        var positionX = 0
        var positionY = 0

        input.forEach {

            var direction = it.split(" ")[0]
            var value = it.split(" ")[1]
            when (direction) {
                "forward" -> positionX += Integer.parseInt(value)
                "up" -> positionY -= Integer.parseInt(value)
                "down" -> positionY += Integer.parseInt(value)
            }
        }

        println(positionX)
        println(positionY)
        return positionX * positionY
    }

    fun submarinePart2(input: List<String>): Int {
        var positionX = 0
        var positionY = 0
        var aim = 0

        input.forEach {

            var direction = it.split(" ")[0]
            var value = it.split(" ")[1]
            when (direction) {
                "forward" ->  {
                    positionX += Integer.parseInt(value)
                    positionY += Integer.parseInt(value) * aim
                }
                "up" -> aim -= Integer.parseInt(value)
                "down" -> aim += Integer.parseInt(value)
            }
        }

        println(positionX)
        println(positionY)
        return positionX * positionY
    }

    val input  = readInput("Day02")
    println("Position Multiplied : "+submarinePart1(input))
    println("Position Multiplied : "+submarinePart2(input))
}
