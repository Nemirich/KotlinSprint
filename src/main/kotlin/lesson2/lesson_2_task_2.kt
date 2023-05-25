package lesson2

fun main() {

    val work = 50 // кол-во работников
    val wCash = 30000 // зп работника (рубли)

    val int = 30 // кол-во стажеров
    val iCash = 20000 // зп стажера

    // Пункт 1
    val wCaslAll = work * wCash // расходы на выплату зарплаты постоянных сотрудников
    println(wCaslAll)

    val iCashAll = int * iCash // расходы на выплату зарплаты стажеров

    // Пункт 2
    val totalSalary = wCaslAll + iCashAll // общие расходы на выплату зарплаты
    println(totalSalary)

    // Пункт 3
    val stuff = work + int

    val averageSalary = totalSalary / stuff // средняя зарплата сотрудника
    println(averageSalary)

}