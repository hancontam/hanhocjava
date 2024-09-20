import java.util.Scanner;

public class InRaThuTrongTuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thu bang so:");
        int a = sc.nextInt();
        switch (a) {
            case 2:
                System.out.println("thu hai");
                break;
            case 3:
                System.out.println("thu ba");
                break;
            case 4:
                System.out.println("thu tu");
                break;
            case 5:
                System.out.println("thu nam");
                break;
            case 6:
                System.out.println("thu sau");
                break;
            case 7:
                System.out.println("thu bay");
                break;
            case 8:
                System.out.println("chu nhat");
                break;

            default:
                System.out.println("dont know");
                break;
        }

        sc.close();
    }
}
