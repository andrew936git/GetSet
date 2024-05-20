class BankCard{
    val numberCard: String = "5555-5555-5555-5555"
    private val code: String = "456"
    private var password: String = "Qwerty123"

    fun checkPassword(){
        println("Для доступа введиите пароль!")
        val pass = readln()
        if (pass == password)
        println("Номер карты $numberCard, код карты $code")
        else println("не верный пароль!")
    }
}