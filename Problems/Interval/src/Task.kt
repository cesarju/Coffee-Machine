import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val a1 = scanner.nextInt()

    println(if (a1> -15 && a1 <=12 || a1 in 15..16 || a1>=19) "True" else "False")
}