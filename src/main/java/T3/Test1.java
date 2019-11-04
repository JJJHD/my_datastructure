package T3;

/**
 * 斐波那契数列
 * 1 1 2 3 5 8 13 ...
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(run(6));
    }
    static int run(int n){
        if (n == 1 || n == 2){
            return n;
        }else {
            return run(n - 1) + run(n - 2);
        }
    }
}
