package lesson1

import java.sql.Time
import java.text.NumberFormat
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.time.DurationUnit
import kotlin.time.TimeSource

fun main() {

    val seconds = 6480
    // кол-во секунд, которое гагарин пробыл в космосе

    val secondsInMinute = 60
    val ostatok = seconds%secondsInMinute // проверяем, что делится без остатка
    //println("$ostatok")

    val minutes: Int = (seconds/secondsInMinute)
    println(minutes)
    // кол-во минут, которое гагарин пробыл в космосе

    val inValue = 0
    val n = 2
    val secondInTime = inValue.toString().padStart(n, '0')
    println(secondInTime)
    // кол-во секунд которое гагарин пробыл в космосе в формате "00"

    println("$minutes:$secondInTime")
}
