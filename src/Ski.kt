//Лыжник 7 дней +10%
class Ski {
    fun skiKotlin() {
        var length = 10.0
        var day = 1
        var sum = length
        var itog = 0.0
        while (day <= 7) {
            println("$day - $length - $sum")
            itog = sum
            day++
            length *= 1.1
            sum += length
        }
        println("-------------")
        println("Итог лыжника: $itog ")
    }
}