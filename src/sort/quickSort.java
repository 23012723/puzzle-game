/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author DR Eminem
 */
public class quickSort {
    // QuickSort class implementing the sorting algorithm


    // Method to sort an array using QuickSort
    public void sort(int[] array) {
        // Call the recursive quickSort function with initial low and high bounds
        quickSort(array, 0, array.length - 1);
    }

    // Helper method that implements QuickSort recursively
    private void quickSort(int[] array, int low, int high) {
        // Base case: if the array has one or zero elements, return
        if (low < high) {
            // Get the partition index where the pivot element is placed correctly
            int partitionIndex = partition(array, low, high);
            
            // Print the array state after each partition step
            System.out.println("After the partition around the pivot, the array now has the following elements sorted: ");
            printArray(array);
            
            // Recursively sort the elements before the partition (left side of pivot)
            quickSort(array, low, partitionIndex - 1);
            
            // Recursively sort the elements after the partition (right side of pivot)
            quickSort(array, partitionIndex + 1, high);
        }
    }

    // Method to partition the array and place the pivot in the correct position
    private int partition(int[] array, int low, int high) {
        // Choose the last element as pivot
        int pivot = array[high];
        System.out.println("partiton around " + pivot);
        // Index of smaller element, to place elements smaller than the pivot
        int i = low - 1;
        
        // Loop through the array to rearrange elements
        for (int j = low; j < high; j++) {
            System.out.println("Is " +pivot+" greater than "+array[j]+ ",if it is, "+array[j]+" is going to be swapped, and if it is not, then no swapping will take place");            
            // If the current element is smaller than the pivot
            if (array[j] < pivot) {
                // Increment the index of the smaller element
                i++;
                // Swap the smaller element with the current element
                swap(array, i, j);
            }
            
        }
        System.out.println("Now "+pivot+" is noved to its correct position and the elements in the array are sorted in this manner: ");
        // Place the pivot element in the correct position
        swap(array, i + 1, high);
        printArray(array);
        // Return the index of the pivot after it has been placed correctly
        return i + 1;
    }

    // Utility method to swap two elements in the array
    private void swap(int[] array, int i, int j) {
        int temp = array[i]; // Store the value at i in a temporary variable
        array[i] = array[j]; // Assign the value at j to i
        array[j] = temp;     // Assign the temporary value to j
    }
        // Utility method to print the elements of an array
     public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i : array) {// Print each element 
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }
     
}
