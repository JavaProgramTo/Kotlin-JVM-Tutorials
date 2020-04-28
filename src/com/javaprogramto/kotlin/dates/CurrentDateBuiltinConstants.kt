package com.javaprogramto.kotlin.dates

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>) {
    var timeNow = LocalDateTime.now()


    var iso_format = DateTimeFormatter.BASIC_ISO_DATE;
    var output = timeNow.format(iso_format);

    println("Current in different formats : ")
    println("ISO fomratted date $output")

    var newTimeNow = LocalDateTime.now()

//    var iso_instant_format = DateTimeFormatter.ISO_INSTANT;
//    output = newTimeNow.format(iso_instant_format);
//
//    println("ISO instant fomratted date $output")
//
    var iso_week_date_format = DateTimeFormatter.ISO_WEEK_DATE;
    output = newTimeNow.format(iso_week_date_format);

    println("ISO week date and time fomratted date $output")

    // var iso_rfc_1123_date_format = DateTimeFormatter.RFC_1123_DATE_TIME;
    //output = newTimeNow.format(iso_rfc_1123_date_format);

    //println("ISO RFC 1123fomratted date $output")

    var iso_time_format = DateTimeFormatter.ISO_DATE_TIME;
    output = newTimeNow.format(iso_time_format);

    println("ISO date and time fomratted date $output")

    var iso_local_time_format = DateTimeFormatter.ISO_LOCAL_TIME;
    output = newTimeNow.format(iso_local_time_format);

    println("ISO local time fomratted date $output")


}

