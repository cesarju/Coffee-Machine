import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val M = scanner.nextInt()
    if (M % 2 == 0)
        println("Divided by 2")
    if (M%3==0)
        println("Divided by 3")
    if (M%5==0)
        println("Divided by 5")
    if (M%6==0)
        println("Divided by 6")
}