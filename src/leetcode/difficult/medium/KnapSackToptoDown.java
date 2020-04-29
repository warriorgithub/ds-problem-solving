package leetcode.difficult.medium;

public class KnapSackToptoDown {

    static int knapSack(int wt[], int val[],int n, int W,int t[][]){
        if(n==0 || W==0) return 0;
        for(int i=1;i<n+1;i++){
            for(int j=1; j<W+1;j++){
                if (wt[i-1]<= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j-wt[i-1]],t[i-1][j]);
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][W];
    }
    public static void main(String args[]){
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;
        int [][] matrix = new int[wt.length+1][W+1];
        for(int i=0;i<matrix.length;i++){
                matrix[0][i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            matrix[i][0]=0;
        }
        System.out.println(knapSack(wt,val,wt.length,W,matrix));
    }
}
