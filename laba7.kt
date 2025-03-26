import kotlin.math.*
import kotlin.random.Random
// 1.Консольный калькулятор
fun calculator (){
    println("Введите первое число: ")
    val a = readln().toDouble()
    println("Введите второе число: ")
    val b = readln().toDouble()
    println("Введите операцию (+; -; *; /; ^; √; abs; %): ")
    val z = readln()
    when (z) {
        "+" -> println("Результат: ${a+b}")
        "-" -> println("Результат: ${a-b}")
        "*" -> println("Результат: ${a*b}")
        "/" -> println("Результат: ${a/b}")
        "^" -> println("Результат: ${a.pow(b)}")
        "√" -> println ("Результат: ${sqrt(a)}")
        "abs" -> println("Результат: ${abs(a)}")
        "%" -> println("Результат: ${a%b}")
        else -> println("Неизвестная операция")
    }
}

// 2.Проверка полиндрома
fun palindrome(){
    println("Введите слово: ")
    val word = readln()
    val isPalidrome = word == word.reversed()
        if (isPalidrome) {
            println("Слово \"$word\" является палиндромом.")
        } else {
            println("Слово \"$word\" не является палиндромом.")
        }
}

// 3. Подсчёт очков команды
fun calculatepoints(wins: Int, draws: Int, losses: Int): Int {
    return wins * 3 + draws * 1
    }
fun minNumbers(numbers: List <Int>): Int{
    return numbers.minOrNull() ?: throw IllegalArgumentException("Список пуст")
}
        fun main() {
            calculator()
            palindrome()
            println("Введите колчество побед: ")
            val wins = readln().toInt()
            println("Введите число ничьих:")
            val draws = readln().toInt()
            println("Введите количество поражений: ")
            val losses = readln().toInt()
            val totalPoints = calculatepoints(wins, draws, losses)
            println("Команда набрала $totalPoints очков.")

// 4.Нахождение минимального числа в списке
            println("Введите числа через пробел: ")
            val input = readln()
            val numbers = input.split(" ").map { it.toInt() }
            val minNumber = numbers.minOrNull()
            println("Минимальное число: $minNumber")

// 5.Проверка равенства двух чисел
            println("Введите первое число: ")
            val num1 = readln().toInt()
            println("Введите второе число: ")
            val num2 = readln().toInt()
            println("Числа равны? ${isEsqual(num1, num2)}")
// 6.Карточная игра
var totalScore = 0
var isGameOver = false
println("Добро пожаловаь в игру 21 очко!")
println("Цель: набрать сумму очков, близкую к 21, но не превышающую её. \n")
while (!isGameOver){
    println("Текущая сумма очков: $totalScore")
    print("Хотите взять карту? (да/нет): ")
    val choice = readln().lowercase()
    when(choice) {
        "да" -> {
            val card = Random.nextInt(1,12)
        totalScore +=card
        println("\nВы получили карту: $card")
        if (totalScore > 21) {
            println("\nСумма очков: $totalScore. Поздравляем, вы проиграли")
            isGameOver = true
        }
    }
        "нет" -> {
            println("\nИтоговая сумма: $totalScore")
            when {
                totalScore == 21 -> println ("поздравляем! Вы набрал ровно 21 очко!")
                totalScore in 18..20 -> println("Хороший результат!")
                else -> println("Можно было рискнуть ещё...")
            }
            isGameOver = true
        }
        else -> println("Неккоректный ввод. Введите 'да' или 'нет'. ")

    }
}
            println("\nВы проиграли все деньги! Приходите ещё!")
        }
fun isEsqual(a: Int, b: Int): Boolean{
    return a == b
}
