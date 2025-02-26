// 22. Угадай число
import kotlin.random.Random
fun main() {
    val number = Random.nextInt(1, 101)
    var guess: Int
    do {
        print("Угадайте число: ")
        guess = readLine()!!.toInt()
        when {
            guess < number -> println("Мало")
            guess > number -> println("Много")
            else -> println("Угадали!")
        }
    } while (guess != number)
}