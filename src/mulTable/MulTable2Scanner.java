package mulTable;

import java.util.Scanner;

public class MulTable2Scanner {

    public static void main(String[] args) {
        /**
         * Comment : Ctrl + /
         * Variable : 변수
         * Datatype 변수명
         */
        System.out.println("4단");
        int result = 4 * 1;
        System.out.println("4 * 1 = "+result);

        /**
         * 입력값 받아서 구구단 출력 예제
         */
        System.out.println("구구단 중 출력할 단은?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.printf("%d * 1 = %d\n",number,number);
        System.out.printf("%d * 2 = %d\n",number,number*2);
        System.out.printf("%d * 3 = %d\n",number,number*3);
        System.out.printf("%d * 4 = %d\n",number,number*4);
        System.out.printf("%d * 5 = %d\n",number,number*5);
        System.out.printf("%d * 6 = %d\n",number,number*6);
        System.out.printf("%d * 7 = %d\n",number,number*7);
        System.out.printf("%d * 8 = %d\n",number,number*8);
        System.out.printf("%d * 9 = %d\n",number,number*9);
    }
}
