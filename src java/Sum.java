public class Sum { //2+4+8+16....+256
    public static void main(String[] args) {
        int a = 1;
        int sum=a;
        while (a < 256) {
            a = a * 2;
            sum=sum+a;
            System.out.println(a+" - "+sum);

        }
        System.out.println("-----------");
        System.out.println("Итог: " + sum);
    }
}

