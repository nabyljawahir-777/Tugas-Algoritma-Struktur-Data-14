public class Recursive_CountOfDigits {
    static int countOfDigits(int number) {
        if (number == 0)
            return 0;
        return 1 + countOfDigits(number/10);
    }

    static void main(String[] args) {
        System.out.println("\nCountOfDigits: ");
        System.out.println(countOfDigits(2468));
    }
}
