data class Customer(val name: String, val email: String)

fun main(args: Array<String>){
    val customer = Customer("Jan Kowalski", "foo@bar.com")
    println(customer)
    println("Hello world!")

    val numbers = arrayListOf(1,2,3,4,5,6)
    println("even numbers: $(numbers.filter { it % 2 == 0 })")

    val countiresCities = listOf(Pair("England", "London"), Pair("France", "Paris"), Pair("Germany", "Berlin"))
    for((country, city) in countiresCities){
        println("Contry: ${country} - City: ${city}")
    }
}