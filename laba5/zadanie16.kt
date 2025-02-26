// 16. Сигма(бой)
fun main() {
    print("Введите N: ")
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n) {
        sum += i * i
    }
    println("Сумма квадратов: $sum")
}