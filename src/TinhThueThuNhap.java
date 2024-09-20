import java.util.Scanner;

public class TinhThueThuNhap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao muc luong cua ban(hang trieu):");
        int a = sc.nextInt();
        if (a < 10) {
            System.out.println("Khong dong thue");
        } else if (10 <= a && a <= 15) {
            System.out.println("Thue la 10%");
        } else if (15 < a && a <= 30) {
            System.out.println("Thue la 20%");
        } else {
            System.out.println("Thue la 50%");
        }
        sc.close();
    }
}