fun main(){
    var number = 100000.toLong()
    var result = recursiveSum(number)
    println("sum of upto $number number = $result")
}

tailrec fun recursiveSum(n:Long, semiresult:Long = 0):Long{
    return if(n <= 0){
        semiresult
    }else{
        recursiveSum((n-1), n + semiresult)
    }
}