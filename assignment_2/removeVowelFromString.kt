fun removeVowel(sentence:String): MutableList<Char>{
    val vowel = arrayOf<Char>('a', 'e', 'i', 'o', 'u')

    var newList = mutableListOf<Char>()

    for(letter in sentence){
        if(!(vowel.contains(letter))){
            newList.add(letter)
        }
    }

    return newList
}

fun main(){
    var statement = "The lord is my shepherd"
    val sentence = removeVowel(statement)

    for(letter in sentence){
        print(letter)
    }
}