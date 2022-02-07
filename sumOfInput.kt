import java.util.Scanner
fun main(){
    var sum = 0
    val input = Scanner(System.`in`)
    println("Enter number: ")
    var userInput = input.nextInt()
    while (userInput != -1) {
        if (userInput != 0){
            sum += userInput
        }
        else{
            break
        }
        userInput = input.nextInt()
    }
    println("Total is $sum")
}