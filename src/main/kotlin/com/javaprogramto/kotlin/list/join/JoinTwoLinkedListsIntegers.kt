package com.javaprogramto.kotlin.list.join

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    var list1 = LinkedList<Int>();

    list1.add(100)
    list1.add(200)

    var list2 = LinkedList<Int>();
    list2.add(300)
    list2.add(400)

    var joinedList = LinkedList<Int>()

    joinedList.addAll(list1);
    joinedList.addAll(list2)

    println("LinkedList one : $list1")
    println("LinkedList two : $list2")
    println("After adding two LinkedList in kotlin program is : $joinedList")

}