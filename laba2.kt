fun main() {
    print("Введите двузначное число: ")
    val n = readln().toInt()
    val d1 = n / 10
    val d2 = n % 10
    println("Десятков: " + d1)
    println("Единиц: " + d2)
    println("Сумма: " + (d1 + d2))
    println("Произведение: " + (d1 * d2))

    print("Введите трёхзначное число: ")
    val m = readln().toInt()
    val m1 = m / 100
    val m2 = (m / 10) % 10
    val m3 = m % 10
    println("Единиц: " + m3)
    println("Десятков: " + m2)
    println("Сумма: " + (m1 + m2 + m3))
    println("Произведение: " + (m1 * m2 * m3))

    print("Введите число: ")
    val a = readln().toDouble()
    print("Введите второе число: ")
    val b = readln().toDouble()
    println("Частное: " + (a / b))

    print("Введите число: ")
    val base = readln().toLong()
    print("Введите степень: ")
    val exp = readln().toInt()
    val power = (1L..exp).fold(1L) { acc, _ -> acc * base }
    println("Результат: " + power)

    print("Введите число для корня: ")
    val num = readln().toDouble()
    val sqrt = num / 2
    var t: Double
    var root = sqrt
    do {
        t = root
        root = (t + num / t) / 2
    } while ((t - root) != 0.0)
    println("Корень: " + root)

    // 1. Логические выражения (A = true, B = false, C = false)
    val A = true
    val B = false
    val C = false

    println("1а) ${A || B}")  // true
    println("1б) ${A && B}")  // false
    println("1в) ${B || C}")  // false

    // 2. Логические выражения (X = false, Y = true, Z = false)
    val X = false
    val Y = true
    val Z = false

    println("2а) ${X || Z}")  // false
    println("2б) ${X && Y}")  // false
    println("2в) ${X && Z}")  // false

    // 3. Логические выражения (A = true, B = false, C = false)
    println("3а) ${!A && B}")  // false
    println("3б) ${A || !B}")  // true
    println("3в) ${(A && B) || C}")  // false

    // 4. Логические выражения (X = true, Y = true, Z = false)
    val X1 = true
    val Y1 = true
    val Z1 = false

    println("4а) ${!X1 && Y1}")  // false
    println("4б) ${X1 || !Y1}")  // true
    println("4в) ${X1 || (Y1 && Z1)}")  // true

    // 5. Повтор задания 4 (X = true, Y = true, Z = false)
    println("5а) ${!X1 && Y1}")  // false
    println("5б) ${X1 || !Y1}")  // true
    println("5в) ${X1 || (Y1 && Z1)}")  // true

    // 6. Логические выражения (X = false, Y = false, Z = true)
    val X2 = false
    val Y2 = false
    val Z2 = true
    println("6а) ${X2 || (Y2 && !Z2)}")  // false
    println("6б) ${(X2 && !Y2) || Z2}")  // true
    println("6в) ${!X2 && !Y2}")  // true
    println("6г) ${X2 && (!Y2 || Z2)}")  // false
    println("6д) ${!(X2 && Z2) || Y2}")  // true
    println("6е) ${X2 || !(Y2 || Z2)}")  // false

// 7. Логические выражения (A = true, B = false, C = false)
    println("7а) ${A || !(A && B) || C}")  // true
    println("7б) ${!A || (A && (B || C))}")  // false
    println("7в) ${(A || (B && !C)) && C}")  // false
}