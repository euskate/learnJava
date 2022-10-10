package mulTable;

import java.util.Scanner;

public class MulTable4If {
    public static void main(String[] args) {
        /**
         * If를 활용하여 2~9단 체크
         */
        System.out.println("몇 단?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("값을 잘못 입력하였습니다.(2~9까지 숫자를 입력하세요)");
        } else if (number > 9) {
            System.out.println("값을 잘못 입력하였습니다.(2~9까지 숫자를 입력하세요)");
        }
        else {
            System.out.println(number + "단");
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }
}
