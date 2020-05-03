public class Nechet { // Сумма нечетных от 1 до 99
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        int b = 0;
        while (a <= 99) {
            if (a % 2 != 0) {
                sum=b+a;
                System.out.println("Число: "+a + " -> "+a+"+"+b+" = " + sum);
                b=sum;
            }
            a++;
        }
    }
}
