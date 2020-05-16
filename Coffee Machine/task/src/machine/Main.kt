package machine
import java.util.*

fun main() {

    //Etapa 1/6 coffe
    /*
    println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")
    */
    //Etapa 2/6

    val scanner = Scanner(System.`in`)
    print("Write how many cups of coffee you will need: > ")
    val nroCafe = scanner.nextInt()
    println("For $nroCafe cups of coffee you will need:")
    println("${nroCafe * 200} ml of water")
    println("${nroCafe * 50} ml of milk")
    println("${nroCafe * 15} g of coffee beans")
}
