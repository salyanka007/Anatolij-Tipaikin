// 24. Транспортирование матрицы
fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val transposed = Array(matrix[0].size) { i -> IntArray(matrix.size) { j -> matrix[j][i] } }
    transposed.forEach { row -> println(row.joinToString()) }
}