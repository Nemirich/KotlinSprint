
fun main() {

    var day = 26
    val proverka = 2
    val whichDayOne = (day % proverka) != 0
    val whichDayTwo = (day % proverka) == 0


    println("""
        Упражнения для рук: $whichDayOne
        Упражнения для ног:$whichDayTwo
        Упражнения для спины: $whichDayTwo
        Упражнения для пресса: $whichDayOne
    """.trimIndent())

}
