// 18. Задача на лестницу
fun main() {
    print("Введите высоту лестницы: ")
    val n = readLine()!!.toInt()
    for (i in 1..n) {
        println("#".repeat(i))
    }
}