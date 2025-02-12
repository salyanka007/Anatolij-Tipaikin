fun main() {
    //Задание 1
    print("Введите три числа: ")
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    val max = maxOf(a, b, c)
    println("Максимальное число: $max")

//Задание 2
    print("Введите три числа: ")
    val (a1, b1, c1) = readln().split(" ").map { it.toInt() }

    if (a1 == b1 || a1 == c1 || b1 == c1) {
        println("Ошибка")
    } else {
        val middle = listOf(a1, b1, c1).sorted()[1]
        println("Среднее число: $middle")
    }
    //Задание 3
    print("Введите два числа: ")
    val (a2, b2) = readln().split(" ").map { it.toInt() }

    val odd = if (a2 % 2 != 0) a2 else b2
    println("Нечетное число: $odd")

    //Задание 4
    print("Введите два числа (большее и меньшее): ")
    val (a3, b3) = readln().split(" ").map { it.toInt() }

    if (a3 % b3 == 0) {
        println("$a3 кратно $b3")
    } else {
        println("$a3 не кратно $b3, остаток: ${a3 % b3}")
    }

    //Задание 5
    print("Введите три стороны треугольника: ")
    val (a4, b4, c4) = readln().split(" ").map { it.toDouble() }

    if (a4 + b4 > c4 && a4 + c4 > b4 && b4 + c4 > a4) {
        println("Треугольник возможен")
    } else {
        println("Треугольник невозможен")
    }

    //Задание 6
    print("Введите год: ")
    val year = readln().toInt()

    val isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
    val days = if (isLeap) 366 else 365

    println(if (isLeap) "Год високосный, $days дней" else "Год не високосный, $days дней")

    //Задание 7
    print("Введите два числа: ")
    val (d, p) = readln().split(" ").map { it.toDouble() }

    println("Большее число: ${maxOf(d, p)}")
    println("Меньшее число: ${minOf(d, p)}")

    //Задание 8
    print("Введите расстояния (в километрах и футах): ")
    val (km, ft) = readln().split(" ").map { it.toDouble() }

    val metersFromKm = km * 1000
    val metersFromFt = ft * 0.305

    println(if (metersFromKm < metersFromFt) "Километры меньше" else "Футы меньше")

    //Задание 9
    print("Введите два числа (m и n): ")
    val (m, n) = readln().split(" ").map { it.toInt() }

    if (m % n == 0) {
        println("Частное: ${m / n}")
    } else {
        println("m на n нацело не делится")
    }

    //Задание 10
    print("Введите два числа (x и y): ")
    val (x, y) = readln().split(" ").map { it.toInt() }

    println(if (y % x == 0) "$x является делителем $y" else "$x не является делителем $y")

    //Задание 11
    print("Введите число: ")
    val num = readln().toInt()

    println(if (num % 2 == 0) "Число четное" else "Число нечетное")
    println(if (num % 10 == 7) "Число оканчивается на 7" else "Число не оканчивается на 7")

    //Задание 12
    print("Введите двузначное число: ")
    val num1 = readln().toInt()

    val firstDigit = num1 / 10
    val secondDigit = num1 % 10

    println(if (firstDigit > secondDigit) "Первая цифра больше" else "Вторая цифра больше")
    println(if (firstDigit == secondDigit) "Цифры одинаковые" else "Цифры разные")

    //Задание 13
    print("Введите четырехзначное число: ")
    val num2 = readln().toInt()

    val d1 = (num2 / 1000) % 10
    val d2 = (num2 / 100) % 10
    val d3 = (num2 / 10) % 10
    val d4 = num2 % 10

    val sumFirstTwo = d1 + d2
    val sumLastTwo = d3 + d4
    val sumAll = sumFirstTwo + sumLastTwo
    val productAll = d1 * d2 * d3 * d4

    println(if (sumFirstTwo == sumLastTwo) "Сумма первых двух цифр равна сумме последних" else "Суммы не равны")
    println(if (sumAll % 3 == 0) "Сумма цифр кратна 3" else "Сумма цифр не кратна 3")
    println(if (productAll % 4 == 0) "Произведение цифр кратно 4" else "Произведение цифр не кратно 4")

    print("Введите число a: ")
    val z = readln().toInt()
    println(if (productAll % z == 0) "Произведение цифр кратно $z" else "Произведение цифр не кратно $z")
}







