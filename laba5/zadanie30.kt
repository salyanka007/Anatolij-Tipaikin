// 30. Конвертация в двоичную систему
fun main() {
    print("Введите число в десятичной системе: ")
    val number = readLine()!!.toInt()
    val binary = Integer.toBinaryString(number)
    println("Число $number в двоичной системе: $binary")
}
