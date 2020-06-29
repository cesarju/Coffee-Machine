import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var aux = 0
    do {
        val nro = scanner.nextInt()
        if (nro > aux) {
            aux = nro
        }
    } while (nro != 0)
    println(aux)
}