fun main(){
    var result = recursiveSum(1000)
    println(result)
}

fun recursiveSum(n:Long):Long{
    return if(n <= 1){
        n
    }else{
        n + recursiveSum(n-1)
    }
}