public class Chet { //Четные от 2 до 100
    public static void main(String[] args) {
        int a = 2;
        while (a <= 100) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
