import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("sayıları giriniz  ");

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        System.out.print("c: ");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            if (b < c) {
                System.out.println("b < c < a");
            } else {
                System.out.println("c < b < a ");
            }
        } else if (a > b && a < c) {
            System.out.println("b < a < c");
        } else if (a > c && a < b) {
            System.out.println("c < a < b");
        } else if (a < b && a < c) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }
    }
}