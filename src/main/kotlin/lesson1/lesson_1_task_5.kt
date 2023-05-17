package lesson1

import java.sql.Time
import java.text.NumberFormat
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import kotlin.time.DurationUnit
import kotlin.time.TimeSource

fun main () {

    val seconds = 6480
    // кол-во секунд, которое гагарин пробыл в космосе

    val secondsInMinute = 60

    val ostatok = seconds%secondsInMinute // проверяем, что делится без остатка
    //println("$ostatok")

    //println(seconds/secondsInMinute)

    val minutes = seconds/secondsInMinute

    val secondsInSpace1 = 0
    val secondsInSpace2 = 0

    println("$minutes : $secondsInSpace1$secondsInSpace2")
}

