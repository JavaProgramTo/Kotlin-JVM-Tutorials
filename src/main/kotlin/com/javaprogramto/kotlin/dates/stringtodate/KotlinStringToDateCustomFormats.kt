package com.javaprogramto.kotlin.dates.stringtodate

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


fun main() {

    val string = "May 31, 2020"


    val formatter = DateTimeFormatter.ofPattern("MMM dd, yy", Locale.ENGLISH)
    val date = LocalDate.parse(string, formatter)


    println("Formated Date object is $date")


}