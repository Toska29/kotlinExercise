fun main(arg: Array<String>){
    val a = 1
    val b = true
    var c = 1
    var result: Int
    var booleanResult: Boolean
    result = -a
    println("-a = $result")
    booleanResult = !b
    println("!b = $booleanResult")
    --c
    println("--c = $c")

    val d = 24
    val e = 50
    var f = 0
    if (d > e){
        f = d
    }
    else {
        f = e
    }
    println("$f is the largest")
}