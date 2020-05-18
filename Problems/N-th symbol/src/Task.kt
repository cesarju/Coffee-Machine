import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val string = scanner.nextLine()
    val nro = scanner.nextInt()
    println("Symbol # $nro of the string \"$string\" is '${string[nro-1]}'")
}