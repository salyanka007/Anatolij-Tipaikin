// 5. Определить знак числа
fun main() {
        println("Введите число:")
        val number = readLine()?.toDoubleOrNull() ?: 0.0
        when {
            number > 0 -> println("Число положительное.")
            number < 0 -> println("Число отрицательное.")
            else -> println("Число равно нулю.")
        }
    }
