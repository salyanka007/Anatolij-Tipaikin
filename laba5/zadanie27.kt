// 27. Печать числа "Пирамида"
fun main() {
    val n = 5
    for (i in 1..n) {
        println((1..i).joinToString(" "))
    }
}