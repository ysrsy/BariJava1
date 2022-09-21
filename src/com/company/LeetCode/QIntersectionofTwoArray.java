package com.company.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QIntersectionofTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        System.out.println(length1);
        System.out.println(length2);
        int i=0;
        int l=0;
        List<Integer> result = new ArrayList();
        while (i<length1 && l<length2){
            if(nums1[i]==nums2[l]){
                if(result.size()>0){
                    if(result.get(result.size()-1)!=nums1[i]){
                        result.add(nums1[i]);
                    }
                }
                else{
                    result.add(nums1[i]);
                }
                i++;
                l++;
            }
            else if(nums1[i]<nums2[l]){
                i++;
            }
            else {
                l++;
            }
        }
        int[] itemsArray = new int[result.size()];
        for(int j=0;j<itemsArray.length;j++){
            itemsArray[j]=result.get(j);
        }
        return itemsArray;
    }
}
