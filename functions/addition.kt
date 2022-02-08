fun add(a:Int, b:Int){
    println(a+b)
}

fun addNumbers(numberOne:Double, numberTwo:Double):Int{
    val sum = numberOne + numberTwo
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main(arg: Array<String>){
    add(2, 4)

    val numberOne = 12.2
    val numberTwo = 3.4
    val result:Int
    result = addNumbers(numberOne, numberTwo)
    print(result)
}