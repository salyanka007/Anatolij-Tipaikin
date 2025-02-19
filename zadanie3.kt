// 3. Вывод оценок по числовым значениям
fun main(){
    print("Введите числовое значение (0-100): ")
    val score =readln()?.toIntOrNull()?:0

    //Определение оценки
    val grade = when (score){
    in 90..100 -> "A"
    in 80..89 -> "B"
    in 70..79 -> "C"
    in 60..69 -> "D"
    else -> "F"
}
    println("Оценка: $grade")
    }