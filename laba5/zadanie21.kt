// 21. Вывод даты
import java.time.LocalDate

fun main() {
    val year = 2025
    val month = 2
    val date = LocalDate.of(year, month, 1)
    val lastDay = date.lengthOfMonth()
    for (day in 1..lastDay) {
        println(LocalDate.of(year, month, day))
    }
}