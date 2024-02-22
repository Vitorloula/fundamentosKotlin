package fundamentosKotlin

fun format(h: Int, m: Int, d: Int, mm: Int, y: Int) {
    val horaFormatada = "%02d:%02d".format(h, m)
    val dataFormatada = "%02d/%02d/%d".format(d, mm, y)

    println(horaFormatada)
    println(dataFormatada)
}

fun main() {
    // Uma lista imutável com etiquetas associadas a cada valor
    val labels = listOf("hours", "minutes", "day", "month", "year")
    // Uma lista mutável que vai receber os valores que sofreram alterações futuras
    val values = mutableListOf<Int>()
    // Um laço com objetivo de pegar as entradas do usuário e transformar em inteiros e a lista mutável
    for (label in labels) {
        print("Enter $label: ")
        val userInput: String? = readlnOrNull()
        val value: Int = userInput?.toIntOrNull() ?: 0
        values.add(value)
    }
    // Pegando os valores inteiros e desempacotando nos lugares certos
    val (h, m, d, mm, y) = values
    format(h, m, d, mm, y)
}
