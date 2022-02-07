fun main(args:Array<String>){
    var num = 10
    var multipleOfEvenNum = 1
    while(num >= 5){
        
        if(num % 2 == 0){
            multipleOfEvenNum = num * 2
            println("Value: $multipleOfEvenNum")
        }
        else{
            println("Loop: $num")
        }
        num--
    }

}