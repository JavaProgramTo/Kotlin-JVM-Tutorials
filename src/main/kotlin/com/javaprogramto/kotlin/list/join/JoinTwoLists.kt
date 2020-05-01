package com.javaprogramto.kotlin.list.join

fun main() {

    var list1 = ArrayList<String>();

    list1.add("one")
    list1.add("two")

    var list2 = ArrayList<String>()

    list2.add("three")
    list2.add("four")

    var joinedList = ArrayList<String>()

    joinedList.addAll(list1);
    joinedList.addAll(1, list2)

    println("List one : $list1")
    println("List two : $list2")
    println("After adding two lists in kotlin program is : $joinedList")


}