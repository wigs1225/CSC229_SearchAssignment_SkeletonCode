
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                //if the current element is greater than the next element, swap.
                if (a[inner] > a[inner + 1]) {
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }

            }
        }
    }

    public static void main(String args[]){
        //Create an array to test the bubble sort algorithm.
        int[] arr = {6, 4, 1, 8, 7};
        int size = arr.length;
        //Call the bubble sort method and print the sorted array.
        bubbleSort(arr, size);
        System.out.println("Sorted array: ");
        for( int i = 0; i < size; i++ ){
            System.out.print(arr[i] + " ");
        }
        //Asymptotic Analysis: Time Complexity: O(n^2), Space Complexity: O(1)
    }
    
    
}

//Github Repository: https://github.com/wigs1225/CSC229_SearchAssignment_SkeletonCode

