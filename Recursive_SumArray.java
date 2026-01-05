public class Recursive_SumArray {
    static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
        }
    static void main(String[] args) {
        int [] numbers = {5,4,3,5,7};

        int result = sumArray(numbers,0);
        System.out.println("sum = " + result);
    }
}
