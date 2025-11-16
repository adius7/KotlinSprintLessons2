package org.example.app.Lessons2

fun main() {

    // Вводные данные
    val money = 70_000
    val percent = 16.7 / 100
    val time = 20

    // Расчет по формуле сложных процентов
    val result = money * Math.pow(1 + percent, time.toDouble())

    // Печать с тремя знаками после запятой
    println(String.format("%.3f", result))
    
}