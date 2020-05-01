package com.javaprogramto.kotlin.collections.list

import java.util.*
import kotlin.collections.ArrayList

fun main() {

    var list1 = LinkedList<Integer>();

    list1.add(Integer(100))
    list1.add(Integer(200))

    var list2 = LinkedList<Integer>();
    list2.add(Integer(300))
    list2.add(Integer(400))

    var joinedList = LinkedList<Integer>()

    joinedList.addAll(list1);
    joinedList.addAll(list2)

    println("LinkedList one : $list1")
    println("LinkedList two : $list2")
    println("After adding two LinkedList in kotlin program is : $joinedList")

}