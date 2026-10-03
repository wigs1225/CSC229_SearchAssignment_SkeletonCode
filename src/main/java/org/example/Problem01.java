
package org.example;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time

        //Create sum to hold the sum of prime numbers
        int sum = 0;
        //Loop through all numbers from n to 2
        while (n > 1) {
            boolean isPrime = true;
            //inner loop to check if the number is prime
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            //if the number is prime, add it to the sum
            if (isPrime) {
                sum += n;
            }
            n--;
        }
    return sum;
    }

    public static void main(String args[]){
        //Test the getSumOfPrimes method
        int n = 10;
        long sum = getSumOfPrimes(n);
        System.out.println("The sum of prime numbers between 1 and " + n + " is: " + sum);
        //Asymptotic Analysis: Time Complexity: O(n^2), Space Complexity: O(1)
    }
    
}

//Github Repository: https://github.com/wigs1225/CSC229_SearchAssignment_SkeletonCode
