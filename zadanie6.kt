// 6. Угадай число
// Импортируем модуль Random
import kotlin.random.Random
fun main() {
    // Загадываем число от 1 до 100
    val secretNumber = Random.nextInt(1, 101) // Загадываем случайное число от 1 до 100
    // Счётчик попыток
    var attempts = 0
    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуйте его угадать.")
    // Цикл продолжается до тех пор, пока пользователь не угадает число
    while (true) {
        print("Введите ваше предположение: ")
            // Преобразуем введённую строку в число; если преобразование не удалось - пропускаем текущую итерацию цикла
        val userGuess = readLine()?.toIntOrNull() ?: continue
        // Увеличиваем счётчик попыток на единицу после каждого ввода пользователя
        attempts++
        // Сравниваем введённое пользователем значение с загаданным числом и выводим подсказки
        when {
            userGuess < secretNumber -> println("Ваше число слишком маленькое. Попробуйте снова.")
            userGuess > secretNumber -> println("Ваше число слишком большое. Попробуйте снова.")
            else -> {
                // Если пользователь угадал правильное значение - выводим поздравление
                println("Поздравляем! Вы угадали за $attempts попыток.")
                break
            }
        }
    }
}