public class AB { // А*В без умножения
    public static void main(String[] args) {
        int a = 5; // что умножаем
        int b = 5; // на что умножаем
        int c = a;
        int cycle = 1;
        while (cycle < b) {
            a = a + c;
            System.out.println("Цикл: " + a);
            cycle++;
        }
        System.out.println("-----------");
        System.out.println("Итог: " + a);

    }
}

