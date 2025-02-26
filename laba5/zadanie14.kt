// 14. Генерация случайных чисел
fun main() {
    val random = java.util.Random()
    for (i in 1..10) {
        print("${random.nextInt(100) + 1} ")
    }
}