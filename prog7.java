/* Union of two sorted arrays */

/* 
import java.util.TreeSet;


public class prog7 {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        TreeSet <Integer> set=new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        int[] union=new int[set.size()];
        int i=0;
        for (int it : set) {
            union[i++]=it;
        }
        return union;
    }
    public static void main(String[] args) {
        int [] nums1={1,1,3,4,5};
        int [] nums2={2,3,4,4,5,6};
        int[] result=unionArray(nums1, nums2);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
} */

import java.util.ArrayList;

public class prog7 {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        ArrayList<Integer> union= new ArrayList<>();
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if((union.size()==0) || (union.get(union.size()-1)!=nums1[i])){
                    union.add(nums1[i]);
                }
                i++;
            }
            else{
                if((union.size()==0) || (union.get(union.size()-1)!=nums2[j])){
                    union.add(nums2[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if((union.size()==0) || (union.get(union.size()-1)!=nums1[i])){
                    union.add(nums1[i]);
            }
            i++;
        }
        while(j<n2){
            if((union.size()==0) || (union.get(union.size()-1)!=nums2[j])){
                    union.add(nums2[j]);
            }
            j++;
        }
        int[] union_Array=new int [union.size()];
        int index=0;
        for (int ele : union) {
            union_Array[index++]=ele;
        }
        return union_Array;  
    }
    public static void main(String[] args) {
        int [] nums1={1,1,3,4,5};
        int [] nums2={2,3,4,4,5,6};
        int [] result=unionArray(nums1, nums2);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
