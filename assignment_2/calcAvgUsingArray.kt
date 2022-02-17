fun average(array:Array<Int>): Double{
    var total = 0
    var average:Double
    
    for(number in array){
        total = total + number
    }
    
    average = (total * 1.0)/array.size
    return average


}

fun main(){
    var array = arrayOf<Int>(4, 5, 6, 7)

    var average = average(array)

    println("Average is $average")
}