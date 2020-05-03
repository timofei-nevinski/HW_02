//Дюймы в см
class Inch {
    fun inchKotlin() {
        var inchcount = 1
        var sum = 0.0
        val inch = 2.54
        val cycle = 20
        while (inchcount <= cycle) {
            sum = inchcount * inch
            println("$inchcount дюйм = $sum см")
            inchcount++
        }
    }
}