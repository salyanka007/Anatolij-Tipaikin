// 28. Определение порядка
import kotlin.random.Random
fun main() {
    val numbers = List(10) { Random.nextInt(1, 101) }
    println("Исходный список: $numbers")
    println("Отсортированный список: ${numbers.sorted()}")
}