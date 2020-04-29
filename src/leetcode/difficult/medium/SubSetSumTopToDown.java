package leetcode.difficult.medium;

public class SubSetSumTopToDown {

    static boolean subSetSum(int [] array, int n, int targetSum, boolean t[][]){
        int sum=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<targetSum+1;j++){
                if(array[i-1]<=j){
                   t[i][j] = t[i-1][j-array[i-1]] || t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][targetSum];
    }

    public static void main(String args[]){
        int arr[] = {1,3,5,8};
        int targetSum= 24;
        boolean matrix[][] = new boolean[arr.length+1][targetSum+1];
        for(int i=0;i<targetSum+1;i++){
            matrix[0][i] = false;
        }
        for(int i=0;i<arr.length+1;i++){
            matrix[i][0] = true;
        }
        System.out.println(subSetSum(arr,arr.length,targetSum,matrix));
    }
}
