package interviewbit.array;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingAndMissingNumber {

    static void repeatingMissing(int arr[]){
        for(int i=0;i<arr.length;i++){
            int actual = arr[i]-1;
            if(arr[i]==actual){
                System.out.println("Repeat "+arr[i]);
                System.out.println("Missing "+actual);
            }else{
                arr[i-1] = arr[i];
            }
        }
    }
    //1,3,3

    public static void main(String[] args) {
        int arr[] = {3,1,3};//{4,3,6,2,1,1};
        repeatingMissing(arr);
    }
}
