fun getDistinctArray(sentence:String):MutableList<Char>{
    var distinctArray = mutableListOf<Char>()

    for(letter in sentence){
        if(!(distinctArray.contains(letter))){
            if(letter != ' '){
                distinctArray.add(letter)
            }
            
        }
    }

    return distinctArray

}

fun main(){
    val sentence = "jbfdgf dgbhfbgn gnfjbfc abcdefghijklmnopqrstuvwxyz"

    var array = getDistinctArray(sentence)


      when(array.size == 26){
        true -> println("The sentence is a pangram")
        false -> println("The sentence is not a pangram")
    }
}