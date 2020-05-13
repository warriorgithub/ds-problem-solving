package leetcode.difficult.medium;

import java.util.Arrays;

public class Countingbits {

    public int[] countBit(int num){
        int array[] = new int[num+1];
        int j=0;
        int i=1;
        if(num==0) {
            int arr[]= {0};
            return arr;
        }
        if(i==0) array[j++]= 0;
        while(i<=num){
            int _oneBit = getBits(i);
            array[++j]=_oneBit;
            i++;
        }
        return array;
    }

    private int getBits(int num){
        String x="";
        while(num>0) {
            int m = num % 2;
            if(m==1)
                x = x + m;
            num = num / 2;
        }
        return x.length();
    }
    public static void main(String args[]){
        Countingbits countingbits = new Countingbits();
        int res[] = countingbits.countBit(5);
        System.out.println(Arrays.toString(res));
    }
}
