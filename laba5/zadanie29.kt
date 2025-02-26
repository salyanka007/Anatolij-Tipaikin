// 29. Сумма ряда
fun main() {
    val n = 5
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
    }
    println("Сумма ряда: $sum")
}