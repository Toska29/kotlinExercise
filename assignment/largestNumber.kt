import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    var maximum = 0
    for(i in 1..3){
        println("Enter value for number $i")
        var value = input.nextInt()
        if (value > maximum){
            maximum = value
        }
    }
    
    println("maximum: $maximum")
}