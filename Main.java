import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BinarySearch b1 = new BinarySearch();
        int[] arr = {1,2,3,4,5};
        int target = 5;
        int result = b1.search(arr, target);
        System.out.println(result);

        ArrayReversal ar1 = new ArrayReversal();
        int[] result1 = ar1.arrayReversal(arr);
        System.out.println(Arrays.toString(result1));
    }
}