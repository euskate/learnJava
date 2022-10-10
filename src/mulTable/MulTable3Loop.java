package mulTable;

import java.util.Scanner;

public class MulTable3Loop {
    public static void main(String[] args) {
        /**
         * while Loop
         */
        System.out.println("몇 단?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;
        while (i < 10) {
            System.out.println(number + " * " + i + " = " + number * i);
            i++;
        }
        /**
         * for Loop
         */
        System.out.println("몇 단?");
        number = scanner.nextInt();
        for (i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
