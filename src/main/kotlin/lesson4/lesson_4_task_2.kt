package lesson4

fun main() {

    // груз номер 1
    var weigth = 20 // вес груза
    var volume = 80 // объем груза

    println("Average для груза с весом $weigth кг и объемом $volume л:" + (minWeight <= weigth && weigth <= maxWeight && volume < maxVolume))

    // груз номер 2
    weigth = 50 // вес груза
    volume = 100 // объем груза

    println("Average для груза с весом $weigth кг и объемом $volume л:" + (minWeight <= weigth && weigth <= maxWeight && volume < maxVolume))


}

const val minWeight = 35 // минимальный вес груза (не строгое неравенство)
const val maxWeight = 100 // максимальный вес груза (не строгое неравенство)
const val maxVolume = 100 // максимальный объем груза (строгое неравенство)