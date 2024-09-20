import java.util.Scanner;

public class NghiemCuaPTBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Vao A cua PT Ax^2+Bx+C=0: ");
        double a = scanner.nextInt();
        System.out.println("Nhap Vao B cua PT Ax^2+Bx+C=0: ");

        double b = scanner.nextInt();
        System.out.println("Nhap Vao C cua PT Ax^2+Bx+C=0: ");

        double c = scanner.nextInt();
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("phuogn trinh vo nghiem");

            } else {

                System.out.println("nghiem cua phuong trinh la" + (-c / b));

            }

        } else {
            if (delta > 0) {
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 la " + x1);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x2 la " + x2);
            } else if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");

            } else {
                double xkep = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep" + xkep);

            }

        }
        scanner.close();
    }
}
