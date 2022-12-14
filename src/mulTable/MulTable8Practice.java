package mulTable;

import java.util.Scanner;

public class MulTable8Practice {
    /**
     * 요구사항 1
     * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
     * 예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
     * 요구사항 2
     * 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
     * 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다. 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.
     */
    public static void main(String[] args) {
        System.out.print("몇단까지?,몇번곱? (input int,int) ");
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        String[] splitedValue = inputValue.split(",");
        int last_times = Integer.parseInt(splitedValue[0]);
        int last_number = Integer.parseInt(splitedValue[1]);

        for (int i = 2; i <= last_times; i++) {
            int[] result = Gugudan.calculate(i, last_number);
            Gugudan.print(i, result);
        }
    }
}
