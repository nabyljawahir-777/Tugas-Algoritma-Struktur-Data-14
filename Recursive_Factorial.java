public class Recursive_Factorial {
    public static int fact(int n){
        if ( n == 1 )
            return 1;
        return n * fact(n-1);
    }
    static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println(fact(n));
    }
}