/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author DR Eminem
 */
public class insertionSort {
        public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }
    // This method implements the Insertion Sort algorithm
    public static void insertionSort(int[] arr) {
        int n = arr.length;  // Get the length of the array

        // Loop through the entire array starting from the second element
        for (int i = 1; i < n; i++) {
            System.out.println("Pass " + (i) + ":");//shows how the array is transformed during the sorting process
            int key = arr[i];  // The current element to be compared
            int j = i - 1;  // Index of the element before the current one
            // Move elements that are greater than the key to one position ahead of their current position
            System.out.println(" ");
             //shows how the array is transformed during the sorting process
            System.out.print("Compare if "+key+" is less ");
                for(int c=j;c >= 0;c--){
            System.out.print(arr[c]+" ");//shows how the array is transformed during the sorting process
                }
            while (j >= 0 && arr[j] > key) {     
                arr[j + 1] = arr[j];  // Shift element to the right
                j = j - 1;  // Move to the previous element in the sorted part
            }  
            if((j+1) == i){
             System.out.println("Therefore "+ key + " will not be inserted anywhere");
            } else {
                System.out.println("Therefore "+key + " is inserted where there is "+ arr[j+1]);
            }
            arr[j + 1] = key;  // Insert the key in its correct position

            // Optional: Display the array after each insertion step (to visualize the process)
                System.out.println("After the pass "+i+ "The array now has the following elements sorted");
                printArray(arr);
                System.out.println(" ");
        }
        System.out.println("Therefore the final sorted array looks like this");
        printArray(arr);
    }
}
