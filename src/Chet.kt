//Четные от 2 до 100
class Chet {
    fun chetKotlin() {
        var a = 2
        while (a <= 100) {
            if (a % 2 == 0) {
                println(a)
            }
            a++
        }
    }
}