// 1. Определить день недели по номеру
fun main() {
    print("Введите номер дня недели (1-7): ")
    val dayNumber = readln()?. toIntOrNull() ?:0
    val dayOfWeek = when (dayNumber){
    1 -> "Понедельник"
    2 -> "Вторник"
    3 -> "Среда"
    4 -> "Четверг"
    5 -> "Пятница"
    6 -> "Суббота"
    7 -> "Воскресенье"
    else -> "Неверный номер дня"
}
    println(dayOfWeek)
}