import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age = sc.nextInt();
        System.out.println("Age of the person is: "+age);
        System.out.println("Enter the salary of the person");
        int sal = sc.nextInt();
        System.out.println("Salary of the person is:" +sal);
        if(age>=21 && sal>21000)
            System.out.println("Person is eligible for getting loan");
        else
            System.out.println("Person is not eligible for getting loan");



    
    }

    
}
