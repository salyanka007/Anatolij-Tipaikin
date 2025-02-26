// 15. Проверка палиндрома
fun main() {
print("Введите строку: ")
    val str =readln()!!
    println(if(str==str.reversed())"Палиндром" else "Не палиндром")
}
