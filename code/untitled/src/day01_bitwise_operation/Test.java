package day01_bitwise_operation;

public class Test {

    public static void main(String[] args) {
        int a = -1024;
        testFunc(5);
        System.out.println();
        testFunc(~5+1);

    }

    public static void testFunc(int num) {
        for (int i = 31; i >= 0; i--) {
            String result = (num & (1 << i)) == 0 ? "0" : "1";
            System.out.print(result);
        }

    }
}


