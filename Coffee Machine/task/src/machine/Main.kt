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

    //Etapa 2/6

    val scanner = Scanner(System.`in`)
    print("Write how many cups of coffee you will need: > ")
    val nroCafe = scanner.nextInt()
    println("For $nroCafe cups of coffee you will need:")
    println("${nroCafe * 200} ml of water")
    println("${nroCafe * 50} ml of milk")
    println("${nroCafe * 15} g of coffee beans")
    */
    //Etapa 3/6

    val scanner = Scanner(System.`in`)
    print("Write how many ml of water the coffee machine has: > ")
    val nroWatter = scanner.nextInt()
    print("Write how many ml of milk the coffee machine has: > ")
    val nroMilk = scanner.nextInt()
    print("Write how many grams of coffee beans the coffee machine has: > ")
    val nroCoffe = scanner.nextInt()
    print("Write how many cups of coffee you will need: > ")
    val cant = scanner.nextInt()

    val cantW:Int = nroWatter/200
    val cantM:Int = nroMilk/50
    val cantC:Int =nroCoffe/15

    if (cantW>=cant){
        if (cantM>=cant) {
            if (cantC>=cant) {
                if (minOf(cantW,cantM,cantC)==cant){
                    println("Yes, I can make that amount of coffee")
                }else{
                    println("Yes, I can make that amount of coffee (and even ${(minOf(cantW,cantM,cantC))-cant} more than that)")
                }
            }
        }
    }else{
        println("No, I can make only ${minOf(cantW,cantM,cantC)} cups of coffee")
    }
}
