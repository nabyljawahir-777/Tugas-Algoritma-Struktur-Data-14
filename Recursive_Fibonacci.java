public class Recursive_Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static void main(String[] args) {
        System.out.println("Fibonacci: ");
        int n = 10;
        for (int i = 1; i < n+1; i++) {
            System.out.print(fibonacci(i)+ " ");
        }
    }
}
