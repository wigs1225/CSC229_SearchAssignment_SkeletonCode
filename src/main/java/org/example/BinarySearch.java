
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm
    // provide time and space analysis

    public static void main(String args[]){

        //Test the binary search method
        //Create a sorted array and a key to search for
        int[] sortedArray = {1, 5, 23, 44, 67, 77, 79, 98, 99, 100};
        int key = 5;
        int low = 0;
        int high = sortedArray.length - 1;

        //Call the binary search method and print the result
        int index = runBinarySearchIteratively(sortedArray, key, low, high);
        if (index != Integer.MAX_VALUE) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
        //Asymptotic Analysis: Time Complexity: O(log n), Space Complexity: O(1)
    }
}


