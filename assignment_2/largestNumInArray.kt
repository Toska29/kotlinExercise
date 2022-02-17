fun largestNumberInArray(array:Array<Int>):Int{
    var largestNumber = 0
    for(number in array){
        if(number > largestNumber){
            largestNumber = number
        }
    }

    return largestNumber
}

fun main(){
    val array = arrayOf<Int>(45, 56, 78, 23)
    var largestNumber = largestNumberInArray(array)

    println("The largest number is $largestNumber")
}