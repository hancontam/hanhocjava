import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so thu 1");
        int a = scanner.nextInt();
        System.out.println("nhap so thu 2");
        int b = scanner.nextInt();
        System.out.println("Min la " + Math.min(a, b));

    }
}
