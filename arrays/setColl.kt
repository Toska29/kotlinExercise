fun main(){
    val mySet: Set<Any> = setOf(2, 6, 4, 29, 5, "Lagos", "Ogun", "Osun")
    val intSet = setOf(5, 4, 28)

    println(".... print Any set....")
    for(element in mySet){
        println(element)
    }

    println("....mySet.contains\"Lagos\"....")
    println(mySet.contains("Lagos"))
    println("....mySet.contains(10)....")
    println(mySet.contains(10))
    println("....mySet.containsAll(intSet)....")
    println(mySet.containsAll(intSet))

    val remainList = mySet.drop(4)
    println(".....print Sat after mySet.drop(4)")
    for(element in remainList){
        println(element)
    }
    
}