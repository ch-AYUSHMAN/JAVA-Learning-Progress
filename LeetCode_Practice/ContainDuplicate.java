 //Input: nums = [1,2,3,1], k = 3
//Output: true
 package LeetCode_Practice;
 import java.util.Scanner;

public class ContainDuplicate {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        int num [] = new int [3];
        System.out.print("ENTER THE ARRAY: ");
        for ( int i = 0 ; i < num.length; i++)
            num[i] = in.nextInt();
            System.out.print("ENTER THE KEY(k): ");
            int k = in.nextInt();
            for(int i = 0; i < num.length; i++)
            for (int j = i+1 ;j < num.length ;j++)
            if (num[i] == num[j] && i-j <= k){
                return true;
            }
            return false;
            

        
        

    }

    
}