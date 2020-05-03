//2+4+8+16....+256
class Sum {
    fun sumKotlin() {
        var a = 1
        var sum = a
        while (a < 256) {
            a *= 2
            sum += a
            println("$a - $sum")
        }
        println("-----------")
        println("Итог: $sum")
    }
}