/*Remove duplicates from sorted array */

/*Brute Force */

/*import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class prog4 {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int j=0;
        for(int ele:set){
            nums[j++]=ele;
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k))); 
        
    }
}*/

/*Optimal Approach */
import java.util.*;
class prog4 {
    public static int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2};
        int k = removeDuplicates(nums);
        System.out.println(k);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, k))); 
    }
}

