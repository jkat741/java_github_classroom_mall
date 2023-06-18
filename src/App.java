import java.util.Scanner;

public class App {

    public static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Miniräknare!");
        int val = 1;
        while (val != 0) {
            val = meny();
            System.out.print("Ange tal 1:");
            int tal1 = scan.nextInt();
            scan.nextLine();
            System.out.print("Ange tal 2:");
            int tal2 = scan.nextInt();
            scan.nextLine();

            switch (val) {
                case 1 -> {
                    int summa = addition(tal1, tal2);
                    System.out.println("summa =" + summa);
                    break;
                }
                case 2 -> {
                    int summa = subtraktion(tal1, tal2);
                    System.out.println("summa =" + summa);
                    break;
                }
            }
        }
    }

    static int subtraktion(int nr1, int nr2) {
        int sum = nr1 - nr2;
        return sum;

    }

    static int addition(int nr1, int nr2) {
        int sum = nr1 + nr2;
        return sum;
    }

    static int meny() {
        System.out.println("1. Addition\n2.Subtraktion\n0.Avlsut");
        System.out.print("Ange val:");
        return scan.nextInt();
    }
}
