import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val a1 = scanner.next().first()
    val a2 = scanner.next().first()
    val a3 = scanner.next().first()
    println(a1+1==a2 && a2+1==a3)
}