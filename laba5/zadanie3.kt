// Сумма чисел от 1 до N
fun main() {
println("Введите число N: ")
    val n = readln()!!.toInt()
    var sum = 0
    for(i in 1..n) {
    sum += i
    }
    println("Сумма чисел от 1 до $n: $sum")
}
