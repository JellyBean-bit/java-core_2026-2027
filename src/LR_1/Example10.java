package LR_1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth:");
        int yearBirth = in.nextInt();

        int age = currentYear - yearBirth;

        System.out.printf("Your age: %d", age);
        in.close();
    }
}
