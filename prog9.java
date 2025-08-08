/* Find missing element */

/* 
public class prog9 {
    public static void missingNumber(int[] nums) {
        int i;
        
        for (i = 0; i <= nums.length - 1; i++) {
            int flag = 0; 
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i); 
            }
        }
    }
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        missingNumber(nums);
    }
} */

class prog9 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }
        return (sum1-sum2);
    }
    public static void main(String[] args) {
        int [] nums = {3,0,1};
        int result=missingNumber(nums);
        System.out.println(result);
    }
}

