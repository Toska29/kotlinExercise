fun mean(array:Array<Int>):Int{
    var sum = 0
    var mean = 0
    for(number in  array){
        sum = sum + number
    }
    mean = sum/array.size
    return mean
}

fun squareDeviation(array:Array<Int>):Double{
  var mean = mean(array)
  var total:Double = 0.0

  for (number in array){
     total = (total * 1.0) + Math.pow((1.0 * (number - mean)), 2.0)
  }

  return total
}

fun standardDeviation(array: Array<Int>):Double{
    var squareDeviation = squareDeviation(array)
    var result = squareDeviation/array.size
    
    var standardDev = Math.sqrt(result)

    return standardDev

}

fun main(){
    val array = arrayOf<Int>(34, 67, 23, 56)

    var standardDev = standardDeviation(array)

    println("Standard deviation is $standardDev")
}
