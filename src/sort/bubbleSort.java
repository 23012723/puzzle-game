/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;
/*
 *
 * @author DR Eminem
 */
public class bubbleSort {
    // Method to print the array
    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }

    // Method for Bubble Sort and show every step
    public static void bubbleSort(int array[]) {
        int n = array.length; 

        for (int i = 0; i < n - 1; i++) {
           boolean swapped = false; //To check if an element is swapped during a pass
            System.out.println("Pass " + (i + 1) + ":");
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("Compare " +array[j]+" and "+ array[j+1]);
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                    System.out.print(", since "+ array[j] +" > "+ array[j + 1]+", swapping is done. ");//shows how the array is transformed during the sorting process
                }
                else{
                System.out.print(", since "+ array[j] +" is not > "+ array[j + 1]+", swapping is not done. ");//shows how the array is transformed during the sorting process
                }
                // Print the array result after each comparison 
                System.out.println("After the pass"+i+ "The array now has the following elements sorted");
                printArray(array);
                System.out.println(" ");
            }
            if (!swapped) break;// break if there is no two elemets swapped by inner loop
        }
    }
}