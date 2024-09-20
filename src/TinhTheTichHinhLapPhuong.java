import java.util.Scanner;

public class TinhTheTichHinhLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh hinh lap phuong di:");
        int a = sc.nextInt();
        System.out.println("------ket qua------");
        System.out.println("The tich canh lap phuong la: " + Math.pow(a, 3));
        sc.close();
    }
}
