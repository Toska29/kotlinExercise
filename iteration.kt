fun main(){
    for (i in 1..5){
        println(i)
    }

    print("for (i in 1..5) print (i) = ")
    for (i in 1..5) 
    print(i)
    println()

    print("for (i in 5..1) print (i) = ")
    for (i in 5..1) 
    print(i)
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1)
    print(i)
    println()

    print("for (i in 1..5 step 2)")
    for (i in 1..5 step 2)
    print(i)
    println()

    print("for (i in 5 downTo 1 step 2) print(i) =")
    for (i in 5 downTo 1 step 2)
    print(i)
}