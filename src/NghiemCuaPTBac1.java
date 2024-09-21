import java.util.Scanner;

public class NghiemCuaPTBac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so A (Ax+B=0): ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao so B (Ax+B=0): ");
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            float x;
            x = (float) -b / a;
            System.out.println("Nghiem cua phuong trinh la" + x);
        }
        scanner.close();
    }
}
