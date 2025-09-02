package LeetCode_Practice;
import java.util.Arrays;
/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
import java.util.Scanner;
public class TwoSum1 {
    public static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int nums [] = new int [n];
        System.out.println("Enter the Elements: ");
        for(int i = 0 ; i < n ; i++){
            nums [i]= scanner.nextInt();
        }
        System.out.print("Enter the Target value: ");
        int target = scanner.nextInt();
        Solution solution = new Solution();
        int [] result = solution.twoSum(nums, target);
        if ( result.length == 2){
            System.out.println ("Indices: " + Arrays.toString(result));
        }else {
            System.out.println("No two numbers found that add up to the Target.");
        }
        
    }
    
}
class Solution {
    public int[] twoSum(int[] nums, int target) { 
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+1 ; j <nums.length ; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
       return new int[]{}; 
    }
}