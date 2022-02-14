import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Enter a number ")
    var number = input.nextInt()
    print ("Enter the divisor: ")
    var divisor = input.nextInt()
    var quotient = number/divisor
    var remainder = number % divisor
    println("Quotient of $number/$divisor is $quotient")
    println("remainder of $number/$divisor is $remainder ")
}