package lesson1

fun main () {

    val year = 1961
    var hour:Int = 9
    var minute:Int = 7

    println("""
        $year
        $hour
        $minute
    """.trimIndent())

    hour = 10
    minute = 55

    println("$hour : $minute")

}
