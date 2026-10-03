
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code
        for(int i = 0; i < n; i++){

            if(arr[i] == x)
                return i;

        }
        return -1;
         //         - prvoide asymptotic analysis of the developed solution
        // Asymptotic Analysis: Time Complexity: O(n), Space Complexity: O(1)
    }
    
}
