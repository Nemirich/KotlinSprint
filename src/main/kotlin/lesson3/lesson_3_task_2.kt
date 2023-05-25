package lesson3

fun main() {

    var name = "Татьяна"
    var surName = "Андреева"
    var midleName = "Сергеевна"
    var age = 20
    val a = "лет"

    println("$surName $name $midleName $age $a") // до брака

    surName = "Сидорова"
    age = 22

    println("$surName $name $midleName $age $a") // после брака

}