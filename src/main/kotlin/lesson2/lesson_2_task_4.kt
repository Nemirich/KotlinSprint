package lesson2
fun main() {

    val crystal = 7 // добыто единиц кристалической руды
    val crystalName: String = "Кристаллическая руда"

    val iron = 11 // добыто единиц металлической руды
    val ironName: String = "Металлическая руда"

    val bonus = 5 // {20% = 1/5} => (x * (1/5) = x / 5)

    val crystalBonus = crystal / bonus
    val ironBonus = iron / bonus

    println("$crystalBonus $crystalName")
    println("$ironBonus $ironName")

}