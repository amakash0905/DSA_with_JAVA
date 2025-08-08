/* Intersection of two arrays */

import java.util.ArrayList;

public class prog8 {
    public static int [] intersectionArray(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> intersection= new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            if(nums2[j]<nums1[i]){
                j++;
            }
            if(nums1[i]==nums2[j]){
                intersection.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] intersection_Array=new int [intersection.size()];
        int index=0;
        for (int ele : intersection) {
            intersection_Array[index++]=ele;
        }
        return intersection_Array;
    }
        public static void main(String[] args) {
        int [] nums1={1,1,3,4,5};
        int [] nums2={2,3,4,4,5,6};
        int [] result=intersectionArray(nums1, nums2);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
