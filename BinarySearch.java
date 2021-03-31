
/**
 * Input: arr = [1,2,3,4,5], target = 5
 * Output: 4
 * 
 * [1,2,3,4,5] int left = 0, int right = arr.length - 1; int middle = left + right / 2;
 * 
 */
public class BinarySearch {
    // given a sorted array and a target value, return 
    // the index of the target value in array if its in there.
    // if num not in there return -1

    public int search(int[]arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right){
            middle = (left+right)/2;
            if (target == arr[middle]) return middle;
            if (target < arr[middle]){
                right = middle -1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}