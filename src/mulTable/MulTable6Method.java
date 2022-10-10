package mulTable;

public class MulTable6Method {
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = calculate(i);
            print(i, result);
        }
    }

    private static void print(int times, int[] result) {
        System.out.println(times + "단");
        for (int i = 0; i < result.length; i++) {
            System.out.println(times + " * " + (i+1) + " = " + result[i]);
        }
    }
}
