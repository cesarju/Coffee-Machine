import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val n = scanner.nextInt()
    var max = 0
    repeat(n) {
        val nro = scanner.nextInt()
        if (nro % 4 == 0) {
            if (nro > max) {
                max = nro
            }
        }
    }
    println(max)
}