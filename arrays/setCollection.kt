fun main(){
    val intSet = setOf(2, 3, 5, 9, 4, 5)
    val mySet: Set<Any> = setOf(2, 3, 5, 9, 4, 5, "Lagos", "Abeokuta")
    println(".... print int set....")

    for(element in intSet){
        println(element)
    }
    println()
    
    for(element in mySet){
        println(element)
    }
}