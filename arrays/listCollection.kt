fun main(){
    var list = listOf("Jane", "John", "Jude")
    for(element in list){
        println(element)
    }

    //we can also pass in different datatype to the listOf() function

    var list2 = listOf(1, 2, 3, "Jane", "John") // read only, fix-size
    for(element in list2){
        println(element)
    }
    println()
    //we can also loop/traverse the list using its index range
    for(index in 0..list2.size-1){
        println(list2[index])
    }
}