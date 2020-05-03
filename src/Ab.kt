// А*В без умножения
class Ab {
    fun abKotlin() {
        var a = 5
        var b = 5
        var c = a
        var cycle = 1
        while (cycle < b) {
            a += c
            println("Цикл: $a")
            cycle++
        }
        println("----------")
        println("Итог: $a")
    }
}