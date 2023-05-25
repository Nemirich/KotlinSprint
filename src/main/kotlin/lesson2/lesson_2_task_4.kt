package lesson2
fun main() {

    val crystal = 7 // добыто единиц кристалической руды
    val iron = 11 // добыто единиц металлической руды
    val bonus = 5 // {20% = 1/5} => (x * (1/5) = x / 5)

    val crystalBonus = crystal / bonus
    val ironBonus = iron / bonus

    println(crystalBonus)
    println(ironBonus)
}