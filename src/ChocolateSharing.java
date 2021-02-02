import java.util.*;
public class ChocolateSharing {
/*Rohit and Rahul are very close friends, and as Rahul’s birthday is coming up, Rohit decides to share a chocolate bar with him.
Rohit has made you the in-charge for the sharing of this chocolate. Each square of the bar has a number written on it, and Rohit
 has decided that he will share a contiguous piece of chocolate, in which the sum of each number on the squares is equal to the
 month in which Rahul was born, and the numbers written on these squares add up to Rahul’s birth date. You need to find the
 number of ways the chocolate bar can be divided.
Input: The input should be in the following format:
The first line should be an integer ‘n’ representing the size of the chocolate bar.
The second line should be ‘n’ elements of array space separated.
Each element of the array indicates the number on the square of the chocolate bar.
The third line should be the value of d indicating the date of Rahul’s birthday.
The fourth line should be the value of m indicating the month of Rahul’s birthday.
Output: The output should be in the following format:
Print the number of ways the chocolate bar can be divided.
Sample test case:
Input:
6
1 3 5 2 4 5
14
4
*/

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; i++){
                arr[i] = s.nextInt();
            }
            int d = s.nextInt();
            int m = s.nextInt();
            numberOfSubArrays(arr, n, d, m);
        }
        // Method to find number of subarrays of size m whose sum of elements is d
        static void numberOfSubArrays(int[] arr,int n, int d, int m){
            // Write your code here
            int i = 0, j = 0;
            int sum = 0;
            int counts = 0;
            for(; j < arr.length; j++) {
                sum += arr[j];

                if (sum > d) {
                    sum -= arr[i];
                    i++;
                } else if (j - i == m - 1) {
                    if (sum == d) counts++;
                    sum -= arr[i];
                    i++;
                }
            }
            System.out.println(counts);
        }
}
