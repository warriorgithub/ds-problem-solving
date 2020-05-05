package leetcode.difficult.medium;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public void mergeArray(int arr1[], int arr2[]){
        int len = (arr1.length-1)+(arr2.length-1);
        int [] mergeArray = new int[len];
        int runningLength = Math.min(arr1.length-1,arr2.length-1);
        int i=0,j=0,k=0;

        while (i<runningLength && j<runningLength){
            if(arr1[i]<arr2[j]){
                mergeArray[k] = arr1[i];
                k++;
                i++;
            }else if(arr1[i]>arr2[j]){
                mergeArray[k] = arr2[j];
                j++;
                k++;
            }
        }if(arr1.length<arr2.length) {
            for (int l = j; l < arr2.length; l++) {
                mergeArray[k] = arr2[l];
                k++;
            }
        }else{
            for (int l = j; l < arr1.length - 1; l++) {
                mergeArray[k] = arr1[l];
                k++;
            }
        }
        System.out.println(Arrays.toString(mergeArray));
    }

    public static void main(String[] args) {
        int []arr1 = {2,8,15,18};
        int [] arr2 = {5,9,12,17,20};
        new MergeTwoSortedArray().mergeArray(arr1,arr2);
    }
}
