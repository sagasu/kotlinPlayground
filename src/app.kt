data class Customer(val name: String, val email: String)

fun main(args: Array<String>){
    val customer = Customer("Jan Kowalski", "foo@bar.com")
    println(customer)
    println("Hello world!")
}