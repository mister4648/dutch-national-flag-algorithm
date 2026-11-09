import java.util.*;
// part 1.a Arrays .
public class MajorityElements {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i < nums.length; i++){
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        if(map.get(nums[i])>nums.length/2)
        {
            return nums[i];
        }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={2,2,1,1,1,2,2};
        MajorityElements me = new MajorityElements();
        System.out.println(me.majorityElement(nums));
    }
   
}