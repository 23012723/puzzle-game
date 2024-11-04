/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sort;
  import java.util.*;  // Importing the Scanner and other utility classes

/**
 *
 * @author DR Eminem
 */
public class main {

    public static void main (String[] args) {  // Main method where program execution starts
        Scanner nal = new Scanner(System.in);  // Creating a Scanner object for user input
        int cont;
        do{     // a do while statement to give the user an option to exit or continue with the game
        int[] array = new int[10];  // Declaring an array to store 10 integers
            System.out.println("Enter 10 random integers for your unsorted array  " );// Asking the user to enter 10 integers
        for (int i = 0; i < array.length; i++) {  // Loop to take 10 inputs from the user
            System.out.print("integer " + (i + 1) + ": ");// Asking the user to enter 10 integers
            array[i] = nal.nextInt();  // Storing user inputs in the array
        }

        // Presenting the user with sorting options
        System.out.println("Choose the sorting method you want to use, only enter a number 1 between 5");
        System.out.println("1. Insertion sort");
        System.out.println("2. Selection sort");
        System.out.println("3. Quick sort");
        System.out.println("4. Bubble sort");
        System.out.println("5. Merge sort");
        System.out.print("Enter your choice: ");
        int choices = nal.nextInt();  // Capturing the user's sorting choice
        while(choices >5 || choices < 1){ //check if the choice is not valid
        System.out.print("Please enter a number 1 between 5: ");
        choices = nal.nextInt();
        }
                
        // Switch case to decide which sorting method to apply
        switch (choices) {
            case 1: // Call insertion sort method
                insertionSort insert = new insertionSort();
                insert.insertionSort(array);
                break;
            case 2: // Call selection sort method
                selectionSort select = new selectionSort(); 
                select.selectionSort(array);
                break;
            case 3:// Call quick sort method
                quickSort quick = new quickSort();  
                quick.sort(array);

                break;
            case 4:  // Call bubble sort method
                bubbleSort bubble = new bubbleSort();
                bubble.bubbleSort(array);
                break;
            case 5:// Call merge sort method
                mergeSort merge = new mergeSort(); 
                merge.mergeSorting(array);
                break;
            default:
                // If the user enters an invalid option
                System.out.println("Invalid choice!!");
                return;  // Exit the program
        }
        System.out.println(" ");
        System.out.println("Would you like to:");
        System.out.println("                    1. Restart the game ");
        System.out.println("                    2. Exit the game ");
        System.out.print("Press 1 restart the game and any number111 to exit :");
        
        cont = nal.nextInt();
       
        }while(cont == 1);
    }
}  

