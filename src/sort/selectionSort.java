/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;

/**
 *
 * @author DR Eminem
 */
public class selectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            System.out.println("Pass " + (i + 1) + ":");
            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                System.out.println(" ");
                System.out.print("Compare ellement in index " +minIndex + "and" + j+", " );
                if (array[j] < array[minIndex]) {
                    System.out.print("because the element in index " +j+ " which is "+array[j] +"is less than the element in index " +minIndex+" which is "+array[minIndex]+". ");//shows how the array is transformed during the sorting process
                    minIndex = j;
                    System.out.print("Now the element with that has the highest chance of  being moved to index "+ i+" is "+array[minIndex]);//shows how the array is transformed during the sorting process
                }else {
                    System.out.print("because the element in index " +j+ " which is "+array[j] +"is greater than the element in index " +minIndex+" which is "+array[minIndex]+". ");//shows how the array is transformed during the sorting process
                    System.out.print("Now the element with that has the highest chance of  being moved to index "+ i+" is still "+array[minIndex]);//shows how the array is transformed during the sorting process

                }
            }
            if(minIndex != i){
            System.out.println("After all the iterations in pass " +i+" it has been found that "+array[minIndex]+"is the lowest element of all the elements in its right");
            }
            else{
            System.out.println("After all the iterations in pass " +i+" it has been found that "+array[minIndex] +"will not be swapped with any element as it is the lowest among all the elements in its right");            
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

                System.out.println("After the pass"+i+ "The array now has the following elements sorted");
                printArray(array);
                System.out.println(" ");
        }
    }
    public static void printArray(int[] array) {
        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" }");
    }
}
