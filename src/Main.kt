//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val card = BankCard()
    card.checkPassword()

//2
    println("Введите целое число")
    var num = readln().toInt()
    num += 7
    num -= 4
    num *= 2
    num %= 3
    println(num)

//3
    println("Введите число")
    var number = readln().toInt()
    //val newNumber: Array<String>
    //var i = 1
    var result = 0
    while(true){
        if (number > 9) {
            result = (result + number % 10) * 10
            number = (number - number % 10) / 10
        }
        else {
            result += number
            break
        }
    }
    println(result)
}