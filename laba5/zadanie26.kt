// 26. Сумма чётных и нечётных чисел
fun main() {
    val n = 10
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..n) {
        if (i % 2 == 0) sumEven += i else sumOdd += i
    }
    println("Сумма четных: $sumEven")
    println("Сумма нечетных: $sumOdd")
}
