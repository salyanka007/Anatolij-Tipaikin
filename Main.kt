import kotlin.random.Random
fun main() {
    // 1. Вывод информации о типах данных
    println("Задание 1")
    println("\nТипы данных в Kotlin:\n")
    println("Целочисленные: Byte, Short, Int, Long")
    println("Дробные: Float, Double")
    println("Символьные: Char")
    println("Логические: Boolean")
    println("Строки: String")
    println("Коллекции: List, Set, Map и их изменяемые версии")
    println("\nПример использования переменных:")
    val intVar: Int = 42
    val stringVar: String = "Привет, Kotlin!"
    println("Int: $intVar")
    println("String: $stringVar")

    // 2. Вывод числа с точностью до сотых
    println("\nЗадание 2")
    val number1 = 3.14159
    println("%.2f".format(number1))

    // 3. Вывод числа e с точностью до десятых
    println("\nЗадание 3")
    val e = Math.E
    println("%.1f".format(e))

    // 4. Ввод числа с клавиатуры и вывод с сообщением
    println("\nЗадание 4")
    print("Введите число: ")
    val input1 = readln().toInt()
    println("Вы ввели число $input1")

    // 5. Ввод числа с клавиатуры и вывод с сообщением после числа
    println("\nЗадание 5")
    print("Введите число: ")
    val input2 = readln().toInt()
    println("$input2 — вот какое число Вы ввели")

    // 6. Вывод чисел 1, 13 и 49 с одним пробелом
    println("\nЗадание 6")
    println("1 13 49")

    // 7. Вывод чисел 7, 15 и 100 с двумя пробелами
    println("\nЗадание 7")
    println("7  15  100")

    // 8. Вывод трех любых чисел с двумя пробелами
    println("\nЗадание 8")
    println("8  22  99")

    // 9. Вывод четырех любых чисел с одним пробелом
    println("\nЗадание 9")
    println("3 5 7 9")

    // 10. Вывод чисел 50 и 10 одно под другим
    println("\nЗадание 10")
    println("50\n10")

    // 11. Вывод чисел 5, 10 и 21 одно под другим
    println("\nЗадание 11")
    println("5\n10\n21")

    // 12. Вывод четырех любых чисел столбиком
    println("\nЗадание 12")
    repeat (4) {

        println(Random.nextInt(100))
    }
}
