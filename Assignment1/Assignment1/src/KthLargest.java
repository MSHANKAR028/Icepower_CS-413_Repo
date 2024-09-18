import java.util.*;
// Time Complexity: O(nlogk)

// Space complexity: O(n)

public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i=0;i<k; i++){
            min.offer(nums[i]);
        }
        for(int i=k; i<nums.length; i++){
            if(nums[i]>min.peek()){
                min.poll();
                min.offer(nums[i]);
            }
        }
        return min.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of elements in the array: ");
        int n = sc.nextInt();
        int[] nums =new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
        System.out.println(findKthLargest(nums, k));

    }































}
