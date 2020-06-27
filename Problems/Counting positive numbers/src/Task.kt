import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var cont = 0
    repeat(n) {
        val nro = scanner.nextInt()
        if (nro > 0) {
            cont += 1
        }
    }
    println(cont)
}