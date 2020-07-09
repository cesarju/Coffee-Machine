import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var nro = scanner.nextInt()
    while (nro != 1) {
        if (nro % 2 == 0) {
            print("$nro ")
            nro /= 2
        } else {
            print("$nro ")
            nro = nro * 3 + 1
        }
    }
    println("1")
}