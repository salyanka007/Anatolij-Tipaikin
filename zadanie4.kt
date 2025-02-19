// 4. Определение времени суток
fun main(){
    print("Введите текущий час: ")
    val hour = readln()?.toIntOrNull()?:-1
    // Определение времени суток
    val timeOfDay = when (hour) {
    in 6..11 -> "Утро"
    in 12..17 -> "День"
    in 18..23 -> "Вечер"
    in 0..5 -> "Ночь"
    else -> "Неверное время"
}
println("Время суток: $timeOfDay")
}