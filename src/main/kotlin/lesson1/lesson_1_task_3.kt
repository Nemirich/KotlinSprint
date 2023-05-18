package lesson1

fun main() {

    val year = 1961
    var hour: Int = 9
    var minute: Int = 7

    val n = 2

    println("$year")
    println(hour.toString().padStart(n, '0'))
    println(minute.toString().padStart(n, '0'))

    hour = 10
    minute = 55

    val clockSign: Char = ':'

    println("$hour$clockSign$minute")

}
