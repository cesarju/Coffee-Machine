package machine
import java.util.*

fun main() {

    //Etapa 4/6
    val scanner = Scanner(System.`in`)
    println("The coffe machine has:")
    var water = 400; var milk = 540; var coffee = 120; var cup = 9; var money = 550
    println("$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money")

    print("\nWrite action (buy, fill, take): > ")
    val opcion:String = scanner.next()
    when(opcion){
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            val opBuy = scanner.nextInt()
            println("\nThe coffee machine has:\n${when(opBuy){
                1 -> {
                    water -= 250; coffee -= 16; money += 4; cup -= 1

                    "$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money"
                }
                2 -> {
                    water -= 350; milk -= 75; coffee -= 20; money += 7; cup -= 1
                    "$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money"
                }
                3 -> {
                    water -= 200; milk -= 100; coffee -= 12; money += 6; cup -= 1
                    "$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money"
                }
                else -> ""
            } }")
        }
        "fill" -> {
            print("Write how many ml of water do you want to add: > ")
            var w1 = scanner.nextInt()
            print("Write how many ml of milk do you want to add: > ")
            var m1 = scanner.nextInt()
            print("Write how many grams of coffee beans do you want to add: > ")
            var c1 = scanner.nextInt()
            print("Write how many disposable cups of coffee do you want to add: > ")
            var cup1 = scanner.nextInt()
            water += w1; milk += m1; coffee += c1; cup += cup1
            print("\nThe coffee machine has: \n$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money")
        }
        "take" -> {
            println("I gave you $$money")
            money = 0
            print("\nThe coffee machine has: \n$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money")

        }
    }
}
