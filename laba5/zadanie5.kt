// 5. Проверка числа на простоту
fun main(){
    println("Введите число: ")
    val n = readln()!!.toInt()
    var isPrime = true
    for (i in 2 until n) {
        if (n % i == 0) {
            isPrime = false
            break
        }
    }
    println(if (isPrime) "$n - простое число" else "$n - не простое число")
}