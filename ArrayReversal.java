/**
 * Input: [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * 
 * Iterative Process:
 *  
 *  Step one:
 *    [5,2,3,4,1]
 *  Step two:
 *    [5,4,3,2,1]
 * 
 * Explanation: Swapping i and arr.length - i - 1 for half of the array length
 */
public class ArrayReversal {

    public int[] arrayReversal(int[] arr){
        int temp;
        for (int i = 0; i < arr.length/2; i++){
            // Store value of arr[i] into temp variable 
            temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }

}
