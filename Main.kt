package  main

import FizzBuzz
import LinkedLists
import MapExample
import SortItems

const val question = "life, the universe, and everything"
const val answer = 42
fun main(args0:Array<String>){
    println("Hello World")
    SortItems(1,2,4,5)
    var data:Map<Int,String> = MapExample("Eldoret","Kisumu","Mombasa")
    println(data)


    val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")
    println(tripleQuotedString)

    val items = mutableListOf<Int>(1,2,3,4,5,6,7,8,9,0)
    FizzBuzz(items)

    var linked = LinkedLists<Int>()
    linked.add(4)
    linked.add(9)
    println(linked.count())
}