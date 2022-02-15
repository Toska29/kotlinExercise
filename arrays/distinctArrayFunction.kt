fun main(){
    //note that the name "Tunde" appears twice in this array
    val names = arrayOf("Seyi", "Tunde", "Wumi", "Chike", "Becca", "Tunde")

    val distinct = names.distinct()

    for(name in distinct){
        println(name)
    }
}