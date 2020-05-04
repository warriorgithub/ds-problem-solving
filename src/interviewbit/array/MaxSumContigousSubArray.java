package interviewbit.array;

import java.util.ArrayList;



public class MaxSumContigousSubArray {

    static int subArraySum(ArrayList<Integer> list){
        int currentSum=list.get(0);;
        int maxSum = list.get(0);

        for(int i=1;i<list.size();i++){
            currentSum = currentSum + list.get(i);
            currentSum = Math.max(currentSum,list.get(i));
            maxSum = Math.max(maxSum,currentSum);
        }return maxSum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add( 1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(-10);


        System.out.println(subArraySum(list));

    }
}
