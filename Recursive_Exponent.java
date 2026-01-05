import java.util.Scanner;

public class Recursive_Exponent {
    static long power(int a,int b) {
        if (b == 1){
            System.out.print(a);
            return a;
        }
        System.out.print(a + " * = ");
        return a * power(a,b - 1);
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        int a = input.nextInt();

        System.out.print("Masukan pangkat: ");
        int b = input.nextInt();

        System.out.print(a + "^" + b + "= ");
        System.out.println(power(a,b));

        input.close();
    }
}