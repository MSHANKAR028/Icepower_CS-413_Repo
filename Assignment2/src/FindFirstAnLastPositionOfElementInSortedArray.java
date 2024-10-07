import java.util.Arrays;

public class FindFirstAnLastPositionOfElementInSortedArray {


    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid=(left+right)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if(target < arr[mid]) {
                right=mid-1;
            }
            else
                left=mid+1;
        }
        return -1;
    }






    public int[] searchRange(int[] nums, int target) {
        int pos = binarySearch(nums, target);
        int[] result = new int[]{-1,-1};
        if (pos == -1) {
            return result;
        }
        for(int i=pos; i>0; i--){
            if(nums[i] == target){
                result[0] = i;
            }
            else
                break;
        }
        for(int i=pos; i<nums.length; i++){
            if(nums[i] == target){
                result[1] = i;
            }
            else
                break;
        }
        return result;

    }
    public static void main(String[] args) {
        FindFirstAnLastPositionOfElementInSortedArray obj = new FindFirstAnLastPositionOfElementInSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(result));
        int target2 = 6;
        int[] result2 = obj.searchRange(nums, target2);
        System.out.println(Arrays.toString(result2));


    }


    }































