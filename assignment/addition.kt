import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Enter first number : ")
    var firstNUmber = input.nextInt()
    print("Enter second number: ")
    var sceondNumber = input.nextInt();
    var total = firstNUmber + sceondNumber
    println("The total: $total")
}