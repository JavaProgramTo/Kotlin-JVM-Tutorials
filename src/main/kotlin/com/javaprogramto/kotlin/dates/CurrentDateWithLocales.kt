package com.javaprogramto.kotlin.dates

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

fun main(args: Array<String>) {
    var current = LocalDateTime.now()

    var fullLocaleFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
    var fullLocaleTime = current.format(fullLocaleFormat)

    println("Current Date and Time in full locale : $fullLocaleTime")

    var longLocaleFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
    var longLocaleTime = current.format(longLocaleFormat)

    println("Current Date and Time in long locale : $longLocaleTime")

    var mediumLocaleFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
    var midiumLocaleTime = current.format(mediumLocaleFormat)

    println("Current Date and Time in medium locale : $midiumLocaleTime")

    var shortLocaleFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
    var shortLocaleTime = current.format(shortLocaleFormat)

    println("Current Date and Time in short locale : $shortLocaleTime")
}

