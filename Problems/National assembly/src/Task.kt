import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val a = scanner.nextDouble()
    val n = Math.cbrt(a)
    val b = n.toInt()
    println(b)
}