class math{
    //user defines infix member function
    infix fun square(n:Int):Int{
        val num = n * n
        return num
    }
     infix fun add(n:Int):Int{
        val num = n + n
        return num
    }
}

fun main(args: Array<String>){
    // creating an object from the main class
    val m = math()
    // call using infix notation
    val result = m square 3
    println("The square of a number is: "+ result)

    val result2 = m add 3
    print("The add of a number is: " + result2)
}