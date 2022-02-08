fun displayBorder(character:Char = '=', length:Int = 15){
    for (i in 1..length){
        print(character)
    }
}

fun main(){
    println("Output when no argument is passed")
    displayBorder()

    println("\n\n'*'is used as a first a first argument")
    println("Output when first argument is passed")
    displayBorder('*')

    println("\n\n'*'is used as a first a first argument")
    println("5 is used as a first a first argument")
    println("Output when first argument is passed")
    displayBorder('*', 5)
    println()
    displayBorder(length = 5)
    println()
    displayBorder(character = '+')

}