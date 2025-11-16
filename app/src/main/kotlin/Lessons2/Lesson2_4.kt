package org.example.app.Lessons2

fun main() {

    // Вводные данные
    val crystal = 7
    val iron = 11

    // Определяем процент от числа добытых ресурсов
    val crystalBonus = (crystal * 20 / 100)  // 7 * 20 / 100 = 1.4
    val ironBonus = (iron * 20 / 100)        // 11 * 20 / 100 = 2.2

    // Полученные результаты округляются до целого числа (дробная часть автоматически отбрасывается)

    println("Бонус ристаллической руды: $crystalBonus")
    println("Бонус железной руды: $ironBonus")
}