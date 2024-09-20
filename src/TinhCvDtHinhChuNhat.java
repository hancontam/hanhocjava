import java.util.Scanner;

public class TinhCvDtHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap canh thu nhat cua hcn: ");
        int a = sc.nextInt();
        System.out.println("nhap canh thu hai cua hcn: ");
        int b = sc.nextInt();
        System.out.println("============");
        System.out.printf("Chu vi hinh chu nhat: %d\n", (a + b) * 2);
        System.out.printf("Dien tich hinh chu nhat: %d\n", a * b);
        System.out.println("Canh nho nhat cua hinh chu nhat la: " + Math.min(a, b));
        sc.close();
    }
}
