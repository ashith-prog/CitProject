import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("eligible to vote and avail government fund");
            } else
                System.out.println("We are  eligible to vote and not elgible to avail government fund");
        } else
            System.out.println("We are not eligible to vote and not eligible to avail government fund ");

    }
}
