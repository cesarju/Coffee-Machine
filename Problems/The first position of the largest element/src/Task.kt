import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var maxValue = Int.MIN_VALUE
    var index = 0
    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()
        if (num > maxValue) {
            maxValue = num
            index++
        }
    }
    println("$maxValue $index")

}