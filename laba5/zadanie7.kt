// 7. Фибоначчи
fun main() {
    print("Введите N: ")
    val n = readLine()!!.toInt()
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
}