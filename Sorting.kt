//package main
fun SortItems(vararg numbers:Int){
    for (i in numbers){
        println(i)
    }
}

fun MapExample(vararg cities:String):Map<Int,String>{
    var list_city:Array<String>


    var solution:Map<Int,String> = mapOf<Int,String>(1 to "Eldoret",2 to "Kisumu ber")
    return solution
}


/*
* If a number is divisible by 3 a Fizz
* If divisible by 5 a Buzz
* If divisible by 3 and 5 FizzBuzz
* */
fun FizzBuzz(check:Collection<Int>){
    for (item in check){
        if (item % 15 == 0){
            println("Fizz Buzz")
        }else if(item % 3 == 0){
            println("Fizz")
        }else if(item % 5 == 0){
            println("Buzz")
        }else println(item)
    }
}