package fundamentosKotlin

fun div(number: Int, number2: Int){
    val divCom = number / number2
    val divResto = number % number2
    val divQuebrada: Double = (number.toDouble() / number2.toDouble())

    println(divCom)
    println(divResto)
    println("%.2f".format(divQuebrada))
}



fun main() {
    val userInput: String? = readlnOrNull()
    val num: Int = userInput?.toIntOrNull() ?: 0

    val userInput2: String? = readlnOrNull()
    val num2: Int = userInput2?.toIntOrNull() ?: 0

    div(num,num2)
}
