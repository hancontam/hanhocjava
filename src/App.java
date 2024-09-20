import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My name is");
        String name = scanner.nextLine();
        System.out.println("Your age is");
        int age = scanner.nextInt();
        System.out.println("My name is: " + name + " and my age is: " + age);
        scanner.close();
    }
}
