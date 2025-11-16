package org.example.app.Lessons2

fun main() {

    // Вводные данные
    val perEmployees = 50
    val perSalary = 30000
    val interns = 30
    val internSalary = 20000

    /* Логика рассчетов такова:
    1. Постоянные сотрудники: 50 × 30000 = 1500000 руб.
    2. Стажеры: 30 × 20000 = 600000 руб.
    3. Общие расходы: 1500000 + 600000 = 2100000 руб.
    4. Средняя ЗП: 2100000 ÷ 80 = 26250 руб.
     */

    // Расходы на выплату зарплаты постоянных сотрудников
    val perEmployeesExpenses = perEmployees * perSalary

    // Общие расходы по ЗП после прихода стажеров
    val totalExpenses = perEmployeesExpenses + interns * internSalary

    // Средняя ЗП одного сотрудника после устройства стажеров
    val averageSalary = totalExpenses / (perEmployees + interns)

    println(perEmployeesExpenses)
    println(totalExpenses)
    println(averageSalary)
}