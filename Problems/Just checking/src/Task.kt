import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    when(scanner.nextInt()) {
        1, 3, 4 -> println("No!")
        2 -> println("Yes!")
        else -> println("Unknown number")
    }
}