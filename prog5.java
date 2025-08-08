/*Rotate an array */

/* 
class prog5 {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        int[] temp1= new int[d];
        int[] temp2= new int[n-d];
        for(int i=0;i<d;i++){
            temp1[i]=nums[n-d+i];
        }
        for(int i=0;i<n-d;i++){
            temp2[i]=nums[i];
        }
        for(int i=0;i<d;i++){
            nums[i]=temp1[i];
        }
        for(int i=d;i<n;i++){
            nums[i]=temp2[i-d];
        }
        for (int ele : nums) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
} */

/* 
class prog5 {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        int[] rotated=new int[n];
        for(int i=0;i<n;i++){
            rotated[(i+d)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=rotated[i];
        }
        for (int ele : nums) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
} */

class prog5 {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        int d=k%n;
        reverse(nums, n-d, n-1);
        reverse(nums, 0, n-d-1);
        reverse(nums, 0, n-1);
        for (int i : nums) {
            System.out.print(i+" ");
        }    
    }

    public static void reverse(int[] nums, int a, int b) {
        while(a<b) {
            int temp=nums[a];
            nums[a]=nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
    }
}
