package org.example.app.Lessons2

fun main() {

    // Вводные данные
    val depHour = 9
    val depMinute = 39
    val travelTimeMinutes = 457

    // Переводим часы в минуты, добавляем минуты выезда, добавляем время в пути
    // Получаем 1036 минут до прибытия (считается с начала суток, т.е с 00:00)
    val totalMinutes = depHour * 60 + depMinute + travelTimeMinutes

    // Переводим минуты в часы (получается 17 часов, это 1020 минут)
    val arrivalHour = totalMinutes / 60

    // Определяем остаток минут от общего числа (1036-1020 = 16минут)
    val arrivalMinute = totalMinutes % 60

    print(arrivalHour)
    print(":")
    println(arrivalMinute)
}