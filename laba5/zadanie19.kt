// 19. Сортировка списка
fun main() {
    val list = mutableListOf(34, 12, 56, 78, 23)
    for (i in 0 until list.size - 1) {
        for (j in 0 until list.size - i - 1) {
            if (list[j] > list[j + 1]) {
                val temp = list[j]
                list[j] = list[j + 1]
                list[j + 1] = temp
            }
        }
    }
    println(list)
}
