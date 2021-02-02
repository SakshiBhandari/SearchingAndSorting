import java.util.*;
public class IncreaseDecreasePlaced {
/*You are given an array of 'n' distinct numbers. You need to sort all the even-placed numbers in increasing order and
all the odd-placed numbers in decreasing order. You need to return the even-placed numbers sorted in increasing order first,
 followed by the odd-placed numbers in decreasing order.
Consider the array {6, 7, 3, 8, 5, 4}.
Even-placed numbers: 6, 3, 5
Odd-placed numbers: 7, 8, 4
Even-placed numbers sorted in increasing order: 3, 5, 6
Odd-placed numbers sorted in decreasing order: 8, 7, 4
Input Format:
The input contains the number of elements in the array, followed by the elements in the array.
Output Format:
The output contains the even-placed numbers sorted in increasing order first, followed by the odd-placed numbers in decreasing order.
Sample Test Cases:
Input:
6 6 7 3 8 5 4
*/

    static void sortIncDec(int arr[], int n) {

        int i = 1;
        int j = n - 1;

        if (j % 2 != 0)
            j--;

        while (i < j) {
            arr = swap(arr, i, j);
            i += 2;
            j -= 2;
        }

        Arrays.sort(arr, 0, (n + 1) / 2);

        Arrays.sort(arr, (n + 1) / 2, n);
        int low = (n + 1) / 2, high = n - 1;

        while (low < high) {
            Integer temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    static int[] swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();

        }
        sortIncDec(arr, length);

        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}