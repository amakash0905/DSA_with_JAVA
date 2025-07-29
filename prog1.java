/*Largest element in an array*/

class prog1 {
    public static int largestElement(int[] nums) {
        int largest=nums[0];
        int n=nums.length;
        for (int i=1;i<n;i++){
            if(nums[i]>largest)
                largest=nums[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int [] arr={5,6,2,4,8};
        int result=largestElement(arr);
        System.out.println(result);
    }
}

