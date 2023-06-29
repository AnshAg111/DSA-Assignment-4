// Question 1
// Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

// **Example 1:**

// Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

// Output: [1,5]

// **Explanation:** Only 1 and 5 appeared in the three arrays.
import java.util.*;
public class solution1 {
    public ArrayList<Integer> sortedArray(int[] arr1, int[] arr2, int[] arr3){
        int i=0, j=0, k=0, l=arr1.length, m=arr2.length, n=arr3.length;
        ArrayList<Integer>ans=new ArrayList<Integer>();
        while(i<l && j<m && k<n){
            if(arr1[i]==arr2[j] && arr2[j]==arr3[k]){
                ans.add(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j] || arr1[i]<arr3[k]) i++;
            else if(arr2[j]<arr1[i] || arr2[j]<arr3[k]) j++;
            else if(arr3[k]<arr1[i] || arr3[k]<arr2[j]) k++;
        }
        return ans;
    }
}
