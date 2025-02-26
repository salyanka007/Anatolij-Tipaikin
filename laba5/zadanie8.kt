// 8. НОД
fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()
    var a = num1
    var b = num2
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    println("НОД: $a")
}