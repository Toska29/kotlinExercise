import java.util.Scanner
fun main(){
    val input = Scanner(System.`in`)

    val alphabet = charArrayOf('a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
    'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')

    println("Enter a character: ")

    var char:Char = input.next().single();
    when((alphabet.contains(char))){
        true -> println("$char is an alphabet")
        else -> println("$char ia not an alphabet")
    }

}
