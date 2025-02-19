// 2. Определить тип треугольника по длинам сторон
fun main(){
    //Определить тип треугольника по длинам сторон
    println("Введите длину стороны a: ")
    val a = readln()?.toIntOrNull()?:0
    println("Введите длину стороны b: ")
    val b = readln()?.toIntOrNull()?:0
    println("Введите длину стороны c: ")
    val c = readln()?.toIntOrNull()?:0
// Определение типа треугольника
    val triangleType = when {
        a == b && b == c -> "Равносторонний"
        a == b || b == c || a == c -> "Равнобедренный"
        else -> "Разносторонний"
    }
    println("Тип треугольника: $triangleType")
}