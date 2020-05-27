package leetcode.difficult.medium;

import algoexpert.difficult.medium.TripletSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoOfSubSetSum {

    private static boolean countSubSet(int arr[],int sum){
        boolean matrix[][] = new boolean[arr.length+1][sum+1];
        for(int i=0;i<sum+1;i++){
            matrix[0][i] = false;
        }
        for(int i=0;i<arr.length+1;i++){
            matrix[i][0] = true;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    //if( )
                    matrix[i][j] = matrix[i-1][j-arr[i-1]] | matrix[i-1][j];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        return matrix[arr.length][sum];


    }
    public static void main(String args[]){
        int arr[] = {2,3,5,6};
        int sum=8;
        System.out.println(countSubSet(arr,sum));
    }
}
