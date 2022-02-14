fun main(){
    val character = 'e'
    val sentence = "the meaning of meekness"

    var frequency = 0
    for(char in sentence){
        if(char == character){
            frequency++
        }
    }
    println("The frequency of $character in $sentence is $frequency")
}