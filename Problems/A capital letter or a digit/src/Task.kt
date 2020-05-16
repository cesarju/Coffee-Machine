import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // write your code here
    val a1 = scanner.next().first()
    println(a1.isUpperCase() || a1 in '1'..'9' )
}