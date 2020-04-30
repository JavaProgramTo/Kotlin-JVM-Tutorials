package com.javaprogramto.kotlin.dates.stringtodate

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


fun main() {


    var dateInString = "2020-05-02"
    var simpleFormat =  DateTimeFormatter.ISO_DATE;


    var convertedDate = LocalDate.parse(dateInString, simpleFormat)


    println("String to Date converted : $convertedDate")

    var dateInString1 = "2020-12-03+01:00";
    var simpleFormat2 =  DateTimeFormatter.ISO_DATE;

    var output = LocalDate.parse(dateInString1, simpleFormat2)


    println("output : "+output)

    val string = "May 31, 2020"

    val formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy", Locale.ENGLISH)
    val date = LocalDate.parse(string, formatter)

    println(date)
}