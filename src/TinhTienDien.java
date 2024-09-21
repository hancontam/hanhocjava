import java.util.Scanner;

public class TinhTienDien {
    public static void main(String[] args) {
        System.out.println("Nhap so dien:");
        Scanner scanner = new Scanner(System.in);
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
        scanner.close();
    }
}
