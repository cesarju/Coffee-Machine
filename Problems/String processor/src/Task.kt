import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val x1 = scanner.next()
    val op = scanner.next()
    val x2 = scanner.next()
    println(when(op) {
        "equals" -> x1 == x2
        "plus" -> x1 + x2
        "endsWith" -> x1.endsWith(x2)
        else -> "Unknown operation"
    })
}