/*Second largest element in an array */


/* Better Approach

class prog2 {
    public static int largestElement(int[] nums) {
        int largest=nums[0];
        int second_largest=-1;
        int n=nums.length;
        for (int i=1;i<n;i++){
            if(nums[i]>largest)
                largest=nums[i];
        }
        for (int i=0;i<n;i++){
            if(nums[i]>second_largest && nums[i]!=largest)
                second_largest=nums[i];
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int [] arr={5,6,2,4,8};
        int result=largestElement(arr);
        System.out.println(result);
    }
} */


/*Optimal Approach */
class prog2 {
    public static int largestElement(int[] nums) {
        int largest=nums[0];
        int second_largest=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]<largest && nums[i]>second_largest){
                second_largest=nums[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int [] arr={5,6,2,4,8};
        int result=largestElement(arr);
        System.out.println(result);
    }
}

