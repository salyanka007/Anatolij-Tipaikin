// 23. Сложение и умножение
fun main() {
    while (true) {
        print("Введите две цифры: ")
        val a = readLine()!!.toInt()
        val b = readLine()!!.toInt()
        println("Сумма: ${a + b}")
        println("Произведение: ${a * b}")
        print("Введите 'стоп' для выхода: ")
        if (readLine() == "стоп") break
    }
}