import java.util.Scanner;

public class MenuTinhToanSimple {
    public static void main(String[] args) {
        while (true) {
            System.out.println("------Tinh Toan 2 So------");
            System.out.println("1. Cong");
            System.out.println("2. Tru");
            System.out.println("3. Thoat");
            Scanner scanner = new Scanner(System.in);
            int schoose = scanner.nextInt();
            switch (schoose) {
                case 1:
                    System.out.println("Nhap vao so thu nhat");
                    int a = scanner.nextInt();
                    System.out.println("Nhap vao so thu hai");
                    int b = scanner.nextInt();
                    System.out.println("Tong hai so la " + (a + b));
                    break;
                case 2:
                    System.out.println("Nhap vao so thu nhat");
                    a = scanner.nextInt();
                    System.out.println("Nhap vao so thu hai");
                    b = scanner.nextInt();
                    System.out.println("Hieu hai so la " + (a - b));
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                    break;
            }
        }
    }
}