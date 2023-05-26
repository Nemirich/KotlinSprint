package lesson4

fun main() {

    val tableNumb = 13 // количество столов в ресторане
    val avToday = 13 // количество забронированных столов сегодня
    val avTomorrow = 13 - 4 // количество забронированных столов завтра

    // доступность столиков на сегодня
    var tableToday: Boolean = avToday < tableNumb
    // доступность столиков на завтра
    var tableTomorrow: Boolean = avTomorrow < tableNumb

    println("Доступность столиков на сегодня: $tableToday\nДоступность столиков на сегодня: $tableTomorrow")

}