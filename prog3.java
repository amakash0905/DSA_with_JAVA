/*Check if array is sorted */

public class prog3 {
    public static boolean isSorted (int[] nums){
        int n =nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
             
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,5,4};
        boolean result=isSorted(a);
        System.out.println(result);
    }
}
