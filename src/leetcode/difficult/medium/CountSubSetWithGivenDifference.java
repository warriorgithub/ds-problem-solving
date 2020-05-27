package leetcode.difficult.medium;

public class CountSubSetWithGivenDifference {

    static int countSubSetWithDifference(int arr[], int diff){
        int sum = calculateSum(arr,diff);
        int count = countSubSet(arr, sum);
        return count;
    }

    private static int calculateSum(int arr[], int diff){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return (diff+sum)/2;
    }

    private static int countSubSet(int arr[], int sum){
        int matrix[][] = new int[arr.length+1][sum+1];
        for(int j=0;j<sum+1;j++){
            matrix[0][j] = 0;
        }
        for(int i=0;i<arr.length+1;i++){
            matrix[i][0] = 1;
        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    matrix[i][j] = matrix[i-1][j-arr[i-1]] + matrix[i-1][j];
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }

        return matrix[arr.length][sum];
    }

    public static void main(String args[]){
        int arr[] = {1,1,1,3};
        int diff =1;
        System.out.println(countSubSetWithDifference(arr,diff));
    }
}
