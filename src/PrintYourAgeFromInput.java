import java.util.Scanner;

public class PrintYourAgeFromInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter your age: ");
        int age = input.nextInt();
        input.close();
        System.out.printf("Your age is: %d", age);


    }
}
