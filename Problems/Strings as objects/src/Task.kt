fun main() {
    val input = readLine()!!
    // write code here
    when {
        input.isEmpty() -> println(input)
        input.first().toString() == "i" -> println(input.drop(1).toInt() + 1)
        input.first().toString() == "s" -> println(input.drop(1).reversed())
        input.first().toString() != "s" || input.first().toString() != "i" -> println(input)
    }
}