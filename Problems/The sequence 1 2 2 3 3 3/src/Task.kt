import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val nro = scanner.nextInt()
    var cont = 1
    var lim = 0
    var aux = 0
    while (nro >= cont) {
        aux = 0
        while (cont > aux && lim != nro) {
            print("$cont ")
            lim += 1
            aux += 1
        }
        cont += 1
    }
}