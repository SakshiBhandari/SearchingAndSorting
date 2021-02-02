import java.util.Scanner;
public class IncreasingDecreasingMax {
/*You are given an array that is first increasing and then decreasing. You need to find the maximum number in the array.
For example, consider the array {1, 2, 4, 7, 10, 9, 5, 3}. The maximum number in the array is 10.
Input Format:
The input contains the number of elements in the array, followed by the elements in the array.
8 1 2 4 7 10 9 5 3*/

    static int max(int arr[], int low, int high) {
        //Write code here
        int max = arr[low];
        int i;
        for (i = low; i <= high; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static void main (String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            System.out.println(max(arr, 0, n-1));
        }
    }
