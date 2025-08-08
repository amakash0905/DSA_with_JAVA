/* Move zeroes to end */

public class prog6 {
    public static void moveZeroes(int[] nums){
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] nums={1,2,0,3,0,4};
        moveZeroes(nums);
    }
}

/* 
class Solution {
    public int[] moveZeroes(int[] nums) {
        int j=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return nums;
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }
        return nums;
    }
    public void swap(int[] nums, int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
    */