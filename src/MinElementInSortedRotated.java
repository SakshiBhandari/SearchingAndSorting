import java.util.Scanner;
public class MinElementInSortedRotated {
/*You are given a sorted array of 'n' elements. The array has been rotated at an unknown pivot. You need to find the minimum element in the array.
Input Format:
The input contains the number of elements in the array, followed by the elements in the array.
Output Format:
The output contains the minimum element in the array.
Sample Test Cases:
Input:
6 3 4 5 6 1 2
*/

        public static int minimum(int arr[], int low, int high)
        {
            //Write code here
            while(low < high)
            {
                int mid = low + (high - low) / 2;
                if (arr[mid] == arr[high]) {
                    high--;
                }
                else if(arr[mid] > arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid;
                }
            }
            return arr[high];
        }

        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(minimum(arr, 0, n-1));
        }
    }
