// 10. Сумма цифр числа
fun main() {
    print("Введите число: ")
    val number = readLine()!!.toInt()
    var sum = 0
    var num = number
    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    println("Сумма цифр: $sum")
}