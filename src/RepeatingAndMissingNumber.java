import java.util.Scanner;
/*You are given an unsorted array containing 'n' elements. The elements are in the range from 1 to n.
However, one element between 1 and n is missing and one element occurs twice. Find the repeating element and the missing element.
Consider the array {2, 5, 4, 1, 4}. The repeating element is 4 and the missing element is 3.
Input Format:
The input contains the number of elements in the array, followed by the elements in the array.
Output Format:
The output contains the repeating element and the missing element.
Sample Test Cases:
Input:
5 2 5 4 1 4
*/
public class RepeatingAndMissingNumber {

        static void find(int arr[], int n)
        {
            //Write code here
            for (int i = 0; i < n; i++) {
                int abs_val = Math.abs(arr[i]);
                if (arr[abs_val - 1] > 0) {
                    arr[abs_val - 1] = -arr[abs_val - 1];
                }
                else {
                    System.out.print(abs_val + " ");
                }
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    System.out.print(i + 1);
                }
            }
        }
        public static void main(String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            find(arr, n);
        }
    }
