package org.example.app

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    println("${"%02d".format(hours)}:%02d:%02d".format(minutes, seconds))
}