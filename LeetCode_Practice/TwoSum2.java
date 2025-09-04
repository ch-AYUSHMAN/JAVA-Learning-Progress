/*Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]*/
package LeetCode_Practice;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSum2 {
    
     public int [] twoSum2 ( int[] numbers , int target ){
    int left = 0 , right = numbers.length - 1;
    int [] res = new int [2];
    while ( left < right){
        int sum = numbers[left] + numbers[right];
        if ( sum == target){
            res [0] = left + 1;
            res [1] = right + 1;   // 1- indexed
            return res;
        
        }else if (sum < target){
            left ++;              // need a bigger sum
        }else{
            right --;            // need a smaller sum
        }
    }
    return res ;    
    }
    public static void main (String args []) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of Element: ");
            int size = scanner.nextInt();
            int numbers[] = new int[size];
            System.out.println("Enter " + size+ " Element-> " );
            for ( int i = 0 ; i < size ; i++){
                System.out.print("Enter element "+(i+1) + ":");
                numbers[i] = scanner.nextInt();
            }
            System.out.print("Enter the target: ");
            int target = scanner.nextInt();
            TwoSum2 solution = new TwoSum2();
            
            int result [] = solution.twoSum2(numbers , target);
            System.out.println(Arrays.toString(result));
        }
        
        
        
    }
    



   

