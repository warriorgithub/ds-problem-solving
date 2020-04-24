package leetcode.difficult.medium;

//Memoization
public class KnapSack {
    static int knapSack(int[] weight, int[] value, int W , int n,int [][] matrix){
        if(W==0 || n==0) return 0;
        if(matrix[n][W]!=-1) return matrix[n][W];
        if(W >= weight[n-1])
            return matrix[n][W] = Math.max(value[n-1]+knapSack(weight,value,W-weight[n-1],n-1,matrix),
                                    knapSack(weight,value,W,n-1,matrix));
        else
        return knapSack(weight,value,W,n-1,matrix);
    }
    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int [][] matrix = new int[wt.length+1][W+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<W+1;j++){
                matrix[i][j] = -1;
            }
        }
        System.out.println(knapSack(wt,val,W,wt.length,matrix));
    }
}
