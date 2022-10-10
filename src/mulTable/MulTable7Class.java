package mulTable;
class Gugudan {
    public static int[] calculate(int times, int number) {
        int[] result = new int[number];

        for (int i = 0; i < result.length; i++) {
            result[i] = times * (i + 1);
        }
        return result;
    }

    public static void print(int times, int[] result) {
        System.out.println(times + "단");
        for (int i = 0; i < result.length; i++) {
            System.out.println(times + " * " + (i+1) + " = " + result[i]);
        }
    }

}
public class MulTable7Class {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            int[] result = Gugudan.calculate(i, 9);
            Gugudan.print(i, result);
        }
    }

}
