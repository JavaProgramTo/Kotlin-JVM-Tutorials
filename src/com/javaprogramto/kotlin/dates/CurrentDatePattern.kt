package com.javaprogramto.kotlin.dates

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    val current = LocalDateTime.now()

    val now = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss.SSS")
    val formatted = current.format(now)

    println("Current Date and Time in a pattern is: $formatted")

    val newFomat = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val onlyDateWithoutTime = current.format(newFomat)

    println("Getting only date from current date in a pattern is: $onlyDateWithoutTime")
}

