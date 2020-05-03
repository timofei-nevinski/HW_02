public class Ski { //Лыжник 7 дней +10%
    public static void main(String[] args) {
        double length = 10;
        int day = 1;
        double sum = length;
        double itog = 0;
        while (day <= 7) {
            System.out.println(day + " - " + length + " - " + sum);
            itog = sum;
            day++;
            length = length * 1.1;
            sum = sum + length;
        }
        System.out.println("-------------");
        System.out.println("Итог: " + itog + " ");
    }
}