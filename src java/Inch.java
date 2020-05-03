public class Inch { //Дюймы в см
    public static void main(String[] args) {
        int inchcount = 1;
        double sum = 0;
        double inch = 2.54;
        int cycle = 20;
        while (inchcount <= cycle) {
            sum = inchcount * inch;
            System.out.println(inchcount + " дюйм = " + sum + " см");
            inchcount++;
        }
    }
}

