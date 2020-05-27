package leetcode.difficult.medium;

import java.util.*;

public class TopKFrequent {
    static int maxFreq = 0;
    public static int[] topKFrequent(int[] nums, int k){
        int resK = k;
       Map<Integer,Integer> maps = countFrequency(nums);
       List<Integer> arr[] = new ArrayList[maxFreq+1];
       for(Map.Entry<Integer,Integer> map : maps.entrySet()){
            if(arr[map.getValue()]==null)
                arr[map.getValue()] = new ArrayList<>();
            arr[map.getValue()].add(map.getKey());
       }
       List<Integer> result = new ArrayList<>();
       int j=0;
       for(int i=arr.length-1;i>0 && k>0;i--){
           List<Integer> list = arr[i];
           if(null!=list)
           result.addAll(list);
           k-= list.size();
       }
       int finalArr[] = new int[resK];
       for(int i=0;i<result.size();i++){
           finalArr[i] = result.get(i);
       }

       return finalArr;
    }
    private static Map<Integer,Integer> countFrequency(int nums[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int val = map.get(nums[i]);
                val++;
                map.put(nums[i], val);
                maxFreq = Math.max(maxFreq,val);
            }else{
                map.put(nums[i],  1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        int arr[] = {4,1,-1,2,-1,2,3};
        topKFrequent(arr,2);
    }
}
//