// 4. Факториал числа
fun main(){
    println("Введите число: ")
    val n = readln()!!.toInt()
    var factorial = 1
    for (i in 1..n){
        factorial *= i
    }
    println("Факториал числа $n: $factorial")
}