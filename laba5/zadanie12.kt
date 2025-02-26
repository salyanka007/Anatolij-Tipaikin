// 12. Числовая последовательность
fun main() {
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    var current = start
    for (i in 1..10) {
        print("$current ")
        current += step
    }
}