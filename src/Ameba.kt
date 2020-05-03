//Амеба каждые 3 часа делится
class Ameba {
    fun amebaKotlin() {
        var a = 1
        var hour = 0
        var itog = 0
        while (hour <= 24) {
            if (hour % 3 == 0) {
                println("$hour ч. - $a шт")
                itog = a
                a *= 2
            }
            hour++
        }
        println("-------------")
        println("Итог: $itog шт")
    }
}