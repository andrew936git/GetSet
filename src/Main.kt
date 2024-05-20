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
    println("Введите двузначное число")
    val number = readln().toInt()
    println("${number % 10}" + "${(number - (number % 10) )/ 10}")
}