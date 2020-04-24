package leetcode.difficult.medium;

import java.util.Arrays;

public class SubSetSum {
    //0,1,3,5,6,8
    static boolean isSubSet(int []arr, int n, int targetSum){
        if(targetSum==0) return true;
        if(n==0 && targetSum!=0) return false;
        return isSubSet(arr,n-1,targetSum-arr[n-1]) ||
                    isSubSet(arr,n-1,targetSum);
    }
    public static void main(String args[]){
     int arr[] = {1,3,5,8};
     int targetSum= 24;
        System.out.println(isSubSet(arr,arr.length,targetSum));

        /*for(boolean[] row : mat){
            System.out.println(Arrays.toString(row));
        }*/
    }
}
