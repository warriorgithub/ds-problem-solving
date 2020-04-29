package leetcode.difficult.medium;
import java.util.List;
import java.util.ArrayList;
public class SprialTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        List<Integer> orderedList =  new ArrayList<>();
        int right= array[0].length-1, left=0, up=0, down=array.length-1;
        int dir=0;

        while(up<=down && left<=right){
            if(dir==0){   //right
                int i=left;
                while(i<=right){
                    orderedList.add(array[up][i]);
                    i++;
                }
                dir = 1;
                up++;
            }
            else if(dir==1){  //top to down
                int j=up;
                while(j<=down){
                    orderedList.add(array[j][right]);
                    j++;
                }dir = 2;
                right--;
            }
            else if(dir==2){ //down right to left
                int k=right;
                while(k>=left){
                    orderedList.add(array[down][k]);
                    k--;
                }dir = 3;
                down--;
            }
            else if(dir==3){
                int l= down;
                while(l>=up){
                    orderedList.add(array[l][left]);
                    l--;
                }dir=(dir+1)%4;
                left++;
            }
        }

        return orderedList;
    }
    public static void main(String args[]){
        int[][] array ={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        spiralTraverse(array);
    }
}
