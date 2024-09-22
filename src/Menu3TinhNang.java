import java.util.Scanner;

public class Menu3TinhNang {

    public static void TinhTienDien(Scanner scanner) {
        System.out.print("Nhap so dien:");
        int phidien = scanner.nextInt();
        int giatien;
        if (phidien < 100 && phidien > 0) {
            giatien = phidien * 1000;
            System.out.println("Tien dien thang nay la: " + giatien);
        } else if (phidien > 100) {
            giatien = 1000 * 100 + (phidien - 100) * 1500;
            System.out.println("Tien dien thang nay la:" + giatien);
        } else {
            System.out.println("khong duoc nhap so am");
        }

    }

    public static void TinhPTBac1(Scanner scanner) {

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
    }

    public static void TinhPTBac2(Scanner scanner) {

        System.out.println("Nhap Vao A cua PT Ax^2+Bx+C=0: ");
        int a = scanner.nextInt();
        System.out.println("Nhap Vao B cua PT Ax^2+Bx+C=0: ");

        int b = scanner.nextInt();
        System.out.println("Nhap Vao C cua PT Ax^2+Bx+C=0: ");

        int c = scanner.nextInt();
        // co the dung func tinhnghiembac1 de rut gon
        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else if (b == 0 && c != 0) {
                System.out.println("phuogn trinh vo nghiem");

            } else {

                System.out.println("nghiem cua phuong trinh la" + (-c / b));

            }

        } else {
            float delta = (float) b * b - 4 * a * c;
            if (delta > 0) {

                System.out.println("Phuong trinh co 2 nghiem phan biet");
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 la " + x1);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x2 la " + x2);
            } else if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");

            } else {
                float xkep = (float) -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep" + xkep);

            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(">>MENU XU LY 3 TINH NANG<<");
            System.out.println("+--------------------------+");
            System.out.println("1. Giai PT bac 1");
            System.out.println("2. Giai PT bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket Thuc");
            System.out.println("+--------------------------+");
            System.out.print("Vui long nhap lua chon: ");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    TinhPTBac1(scanner);
                    break;
                case 2:
                    TinhPTBac2(scanner);
                    break;
                case 3:
                    TinhTienDien(scanner);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("lua chon k hop le");
                    break;
            }
        }

    }
}
