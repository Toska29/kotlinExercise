fun main(){
    val names = arrayOf<String>("Seyi", "Tunde", "Wumi", "Chike", "Becca", "Tunde")

    val result = names.drop(2)

    for(name in result){
        println(name)
    }
}