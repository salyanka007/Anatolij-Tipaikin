// 11. Анаграммы
fun main() {
    print("Введите первую строку: ")
    val str1 = readLine()!!
    print("Введите вторую строку: ")
    val str2 = readLine()!!
    val sortedStr1 = str1.toCharArray().sorted().joinToString("")
    val sortedStr2 = str2.toCharArray().sorted().joinToString("")
    println(if (sortedStr1 == sortedStr2) "Анаграммы" else "Не анаграммы")
}
