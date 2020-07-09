package machine
import java.util.*

fun main() {

    //Etapa 4/6
    val scanner = Scanner(System.`in`)
    println("The coffe machine has:")
    var water = 400; var milk = 540; var coffee = 120; var cup = 9; var money = 550
    //println("$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$money of money")

    do {
        print("\nWrite action (buy, fill, take, remaining, exit): > ")
        val option:String = scanner.next()
        when(option){
            "buy" -> {
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: > ")
                when(scanner.next()){
                    "1" -> {
                        if (water >= 250) {
                            water -= 250; coffee -= 16; money += 4; cup -= 1
                            println("I have enough resources, making you a coffee!")
                        } else {
                            println("Sorry, not enough water!")
                        }

                    }
                    "2" -> {
                        if (water >= 350) {
                            water -= 350; milk -= 75; coffee -= 20; money += 7; cup -= 1
                            println("I have enough resources, making you a coffee!")
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                    "3" -> {
                        if (water >= 200) {
                            water -= 200; milk -= 100; coffee -= 12; money += 6; cup -= 1
                            println("I have enough resources, making you a coffee!")
                        } else {
                            println("Sorry, not enough water!")
                        }
                    }
                }
            }
            "fill" -> {
                print("\nWrite how many ml of water do you want to add: > ")
                val w1 = scanner.nextInt()
                print("Write how many ml of milk do you want to add: > ")
                val m1 = scanner.nextInt()
                print("Write how many grams of coffee beans do you want to add: > ")
                val c1 = scanner.nextInt()
                print("Write how many disposable cups of coffee do you want to add: > ")
                val cup1 = scanner.nextInt()
                water += w1; milk += m1; coffee += c1; cup += cup1
            }
            "take" -> {
                println("\nI gave you $$money")
                money = 0
            }
            "remaining" -> {
                println("\nThe coffee machine has: \n$water of water \n$milk of milk \n$coffee of coffee beans \n$cup of disponsable cups \n$$money of money")
            }
        }
    }while (option != "exit")
}

//if (water >=250 && coffee >= 16 && cup > 0)
//if (water >=350 && milk >=75 && coffee >= 20 && cup > 0)
//if (water >= 200 && milk >= 100 && coffee >= 12 && cup > 0)