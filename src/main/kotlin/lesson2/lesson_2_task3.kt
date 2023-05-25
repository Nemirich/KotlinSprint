package lesson2

import java.time.LocalTime

fun main() {

    val mInH = 60 // кол-во минут в часе
    val hourStartTrain = 9 // в который час отправляется поезд
    val minuteStartTrain = 39 // в которую отправляется поезд
    val minuteOnRoad = 457 // общее количество минут в пути

    val minuteArrivalTrain = hourStartTrain * 60 + minuteStartTrain +minuteOnRoad
    // через какое количество минут после начала дня поезд прибудет

    val hourArrival = minuteArrivalTrain / mInH // во сколько часов приедет поезд
    val minuteArrival = minuteArrivalTrain % mInH // во сколько минут приедет поезд

    println(LocalTime.of(hourArrival,minuteArrival)) // время прибытия

}