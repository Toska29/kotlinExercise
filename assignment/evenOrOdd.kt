import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Enter a number: ")
    var number = input.nextInt()

    // if (number % 2 == 0){
    //     println("$number is an even number")
    // }else{
    //     println("$number is an odd number")
    // }
    when(number % 2 == 0){
        true -> println("$number is an even number")
        false -> println("$number is odd number")
    }

}