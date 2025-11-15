package org.example.app

fun main() {

    // Год полета
    val year = 1961

    // Время взлета(изменяемые переменные)
    var hour = 9
    var minute = 7

    // Вывод года, часа и минуты взлета
    println(year)
    println(hour)
    println(minute)

    // Изменяем значения на время посадки
    hour = 10
    minute = 55

    // Вывод времени посадки в одной строке в формате [часы:минуты]
    print(hour)
    print(":")
    print(minute)

    // println - выводит текст и переходит на новую строку
    // print - выводит текст и остается на той же строке

}