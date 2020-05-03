public class Ameba { //Амеба каждые 3 часа делится
    public static void main(String[] args) {
        int a = 1;
        int hour = 0;
        int itog = 0;
        while (hour <= 24) {
            if (hour % 3 == 0) {
                System.out.println(hour + " ч. - " + a + " шт");
                itog = a;
                a = a * 2;
            }
            hour++;
        }
        System.out.println("-------------");
        System.out.println("Итог: " + itog + " шт");
    }
}
