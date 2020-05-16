import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val h1 = scanner.next()
    val h2 = scanner.next()
    val h3 = scanner.next()
    print(h1<=h2 && h2<=h3 || h1>=h2 && h2>=h3)
}