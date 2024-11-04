/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author DR Eminem
 */
public class mergeSort {
    //implementation method of merge sort algorithm
    
    public static int[] mergeSorting(int[]arr){
        // Shows what happens to the array
    System.out.println("The array is sorted into two equal halves and each array is recursively sorted, then merged back together to form the final sorted array.");
     
     
      //base case: if array has 1 0r 0 elements,it  means array is already sorted
        
     if(arr.length<=1){
         return arr;
     }
      
     //find the middle index to devide array into two halves
     int mid=arr.length/2;
     
     //creating left and right subarrays 
     int[]leftHalf=new int[mid];
      int[]rightHalf=new int[arr.length-mid];
      
      //copying elements from original array to the subarrays
      System.arraycopy(arr,0,leftHalf,0,mid);
      System.arraycopy(arr,mid,rightHalf,0,arr.length-mid);
      
      //recursively sorting left and right subarrays
      leftHalf=mergeSorting(leftHalf);
      rightHalf=mergeSorting(rightHalf);
      System.out.println("There for after sorted array has the following elements: ");
      printArray(arr);
      //merge sorted subarrays
      return merge(leftHalf,rightHalf);
      
    }    
    
    //method to merge the leftHand and rightHand subarrays    
    public static int[] merge(int[]left,int[]right){
      System.out.println("And Now it is time to merge the array back to its original form while ");  
     //create  merged array with size equal to left+right
     int[]merged=new int[left.length+right.length];
     
     //initialize indices for left ,right and merged arrays
     int leftIndex=0;
     int rightIndex=0;
     int mergeIndex=0;
     
     //mege smaller elements first
     while(leftIndex<left.length&&rightIndex<right.length){
         if(left[leftIndex]<=right[rightIndex]){             
            //copy smaller elements from left array
            merged[mergeIndex++]=left[leftIndex++];
         }
         else{
             //copy smaller elements from right array
             merged[mergeIndex++]=right[rightIndex++];
         }
    }
     
    while(leftIndex<left.length){
         merged[mergeIndex++]=left[leftIndex++];
         
     } //copy remaining elements from left array
     while(leftIndex<left.length){
         merged[mergeIndex++]=left[leftIndex++];
         
     }
       //copy remaining elements from right array
     while(rightIndex<left.length){
         merged[mergeIndex++]=right[rightIndex++];
         
     }
     return merged;
    }
       public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }
}
