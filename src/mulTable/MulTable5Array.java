package mulTable;

public class MulTable5Array {
    public static void main(String[] args) {
        /**
         * Array
         */
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = 2 * (i + 1);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        /**
         * double for multiplication Table
         */
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
        /**
         * double for and array
         */
        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단");
            for (int j = 0; j < result.length; j++) {
                result[j] = i*j;
                System.out.println(i + " * " + (j+1) + " = " + result[j]);
            }
        }
    }
}
