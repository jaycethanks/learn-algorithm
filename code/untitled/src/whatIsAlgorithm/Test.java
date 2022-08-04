package whatIsAlgorithm;

public class Test {
    public static long f1(int N){
        long ans = 0;
        for(int i = 1; i <= N; i++){
            ans += factorial(i);
        }
        return ans;
    }
    public static long factorial(int N){
        long ans = 1;
        for(int i = 1; i <= N; i++){
            ans *= i;
        }
        return ans;
    }

    public static long f2(int N){
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N;i ++){
            cur = cur * i;
            ans += cur;
        }
        return ans;
    }
    public static void main(String[] args) {
        long res = f1(3);
        long res2 = f2(3);
        System.out.println(res);
        System.out.println(res2);
    }
}
