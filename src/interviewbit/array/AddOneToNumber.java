package interviewbit.array;

import java.util.ArrayList;

public class AddOneToNumber {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry =1;
        int j = 0;
        while (j < A.size() - 1 && A.get(j) == 0) {
            A.remove(j);
        }
        if(A.get(0)==0 && A.size()==1){
            A.set(0,1);
            return A;
        }
        int thresold = 9;
        for(int i=A.size()-1;i>=0;i--){
                int sum =  A.get(i)+carry;
            if(sum>thresold){
                carry = 1;
                A.set(i,0);
            }else{
                carry = 0;
                A.set(i,sum);
            }
        }
        if(carry==1){
            A.add(0,1);
        }
        return A;
    }
    public static void main(String[] args) {
        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);

        new AddOneToNumber().plusOne(c);
    }
}
