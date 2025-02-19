// 7. Определение длины строки
fun main() {
    print("Введите строку: ")
    val inputString = readLine() ?: ""
    // Определяем длину строки с помощью свойства length
    val stringLength = inputString.length
    // Выводим результат на экран
    println("Длина введённой строки: $stringLength")
}