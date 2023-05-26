fun main() {

    var todayWeater = "sunny"
    var todayTent = "there is"
    var todayHumidity = 0.2F
    var todaySeason = "winter"

    val conditions = (todayWeater == weater) && (todayTent == tent) && (todayHumidity == humidity) && !(todaySeason == season)
    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")

}

const val weater = "sunny"
const val tent = "there is"
const val humidity = 0.2F
const val season = "winter"