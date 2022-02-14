fun main(){
    val vowel = charArrayOf('a', 'e', 'i', 'o', 'u')
    val alphabet = 'b'

    if (vowel.contains(alphabet)){
        println("$alphabet is vowel")
    }else{
        println("$alphabet is consonant")
    }
}