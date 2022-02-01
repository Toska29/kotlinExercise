fun main (args: Array<String>){
    val numbers = intArrayOf(1, 4, 42, -3)
    if(4 in numbers){
        println("numbers array contains 4.")
    }

    val a = intArrayOf(1, 2, 3, 4, -1)
    println(a[1])
    a[1] = 12
    println(a[1])

    val b = a[2] + a[3]
    println(b)
}