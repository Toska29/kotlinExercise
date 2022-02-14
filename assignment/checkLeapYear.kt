import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)
    println("Enter the year value: ")
    var year = input.nextInt()

    when((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ))){
        true -> println("year: $year is a leap year")
        false -> println("year: $year is not a leap year")
    }
}