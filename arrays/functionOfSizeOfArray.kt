fun <T> sizeOfArray(list: List<T>): Int{
    return list.size
}

fun main(){
    // var names = listOf<String>("Seyi", "Tunde", "Wumi", "Chike", "Becca", "Tunde")

        var numbers = listOf<Any>(1,3,5,"Tunde", "Wumi", "Chike", "Becca")


    var result = sizeOfArray(numbers)
    println(result)
}