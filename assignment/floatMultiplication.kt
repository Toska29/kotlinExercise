import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    print("Enter float number: ")
    var firstNUmber = input.nextDouble()
    print ("Enter float number: ")
    var sceondNumber = input.nextDouble()

    val multiplication:Double

    multiplication = firstNUmber * sceondNumber
    // var result = String.format("result: %.2f", multiplication).toDouble()
    print("result: $multiplication")
}