// 20. Простые числа в диапазоне
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}

fun main() {
    val start = 10
    val end = 50
    for (i in start..end) {
        if (isPrime(i)) println(i)
    }
}