fun main(){
    val cloudServices = arrayOf("Microsoft", "Amazon", "Google", "Heroku")

    val cloudServices_2 = arrayOf<String>("Microsoft", "Amazon", "Google", "Heroku")

    println(cloudServices[0])
    println(cloudServices_2[3])

    cloudServices.set(3, "Digital ocean")
    println(cloudServices.get(3))

    println("Size of cloudService array " + cloudServices.size)
}