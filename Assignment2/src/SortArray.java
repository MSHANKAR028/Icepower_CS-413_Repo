import java.util.Arrays;
//Time Complexity: o(nlogn)
//Space Complexity: O(N)

public class SortArray {

   public void Sort(int[] arr, int left, int right) {
       if(left>=right)
           return;
       int mid = (left + right) / 2;
       Sort(arr, left, mid);
       Sort(arr, mid + 1, right);
       merge(arr,left, mid, right);

   }
   public void  merge(int[] arr, int left, int mid, int right) {
       int[] arr1 = new int[mid - left + 1];
       int[] arr2 = new int[right - mid];
       for(int i = 0; i < arr1.length; i++){
           arr1[i] = arr[left + i];
       }
       for(int j = 0; j < arr2.length; j++){
           arr2[j] = arr[mid + 1 +  j];
       }
       int i = 0, j = 0; int k = left;
       while(i < arr1.length && j < arr2.length){
           if(arr1[i] < arr2[j]){
               arr[k] = arr1[i];
               i++;
           }
           else{
               arr[k] = arr2[j];
               j++;
           }
           k++;
       }
       for(;i < arr1.length;i++,k++){
           arr[k] = arr1[i];

       }
       for(;j < arr2.length; j++,k++){
           arr[k] = arr2[j];
       }
   }
   public static void main(String[] args) {
       SortArray arr = new SortArray();
       int[] nums={5,2,3,1};
       System.out.println("Given Array");
       System.out.println(Arrays.toString(nums));
       arr.Sort(nums, 0, nums.length-1);
       System.out.println("Sorted Array");
       System.out.println(Arrays.toString(nums));
   }
















}
