// Сумма нечетных от 1 до 99
class Nechet {
    fun nechetKotlin() {
        var a = 1
        var sum = 0
        var b = 0
        while (a <= 99) {
            if (a % 2 != 0) {
                sum = b + a
                println("Число: $a -> $a+$b = $sum")
                b = sum
            }
            a++
        }
    }
}