import kotlin.math.roundToInt

fun main() {
    val commission = 0.0075
    val minimalSum = 3500
    val userCommission: Double

    while (true) {
        println("Введите сумму перевода")
        val amount: Int = readLine()!!.toInt() * 100

        if (amount >= minimalSum) {
            val userCommissionKopeyki = ((amount * commission).roundToInt())
            userCommission = userCommissionKopeyki.toDouble() / 100
            println("Сумма комиссии $userCommission рублей")
            break
        } else {
            println("Возможен перевод только от 35 рублей")
        }
    }
}