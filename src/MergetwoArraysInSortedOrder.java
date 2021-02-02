import java.util.Scanner;
/*You are given two sorted arrays. The first array is of size (m+n) with m elements and the second array is of size n with n elements.
Merge the elements from two arrays into one array in the sorted order without using extra space and linear time complexity.
Input Format:
The input contains the number of elements in the first array, followed by the number of elements in the second array.
The next line contains the elements of the first array (with '-1' indicating that the array is not filled at that index).
The next line contains the elements of the second array.
Output Format:
The output contains the elements of the merged array.
Sample Test Cases:
Input:
5 4
2 8 -1 -1 -1 13 -1 15 20
5 7 9 25
*/
public class MergetwoArraysInSortedOrder {

    void moveToEnd(int arr1[], int size) {
        int i, j = size - 1;
        for (i = size - 1; i >= 0; i--) {
            if (arr1[i] != -1) {
                arr1[j] = arr1[i];
                j--;
            }
        }
    }

    /* Merges array arr2[] of
       size n into array arr1[]
       of size m+n*/
    /* Utility that prints out an array on a line */

    static void merge(int arr1[], int arr2[], int m, int n) {
        //Write code here
        int i = n;

        /* Current index of i/p part of arr2[]*/
        int j = 0;

        /* Current index of arr2[]*/
        int k = 0;

        /* Current index of output arr1[]*/
        while (k < (m + n)) {
            /* Take an element from mPlusN[] if
            a) value of the picked element is smaller and we
            have not reached end of it b) We have reached
            end of N[] */
            if ((i < (m + n) && arr1[i] <= arr2[j]) || (j == n)) {
                arr1[k] = arr1[i];
                k++;
                i++;
            } else // Otherwise take element from N[]
            {
                arr1[k] = arr2[j];
                k++;
                j++;
            }
        }
    }
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        MergetwoArraysInSortedOrder mg = new MergetwoArraysInSortedOrder();
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        int arr1[] = new int[m + n];
        int arr2[] = new int[n];
         n = arr2.length;
         m = arr1.length - n;

        for (int i = 0; i < m + n; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        mg.moveToEnd(arr1, m+n);
        mg.merge(arr1, arr2, m, n);
        mg.printArray(arr1, m+n);
    }
}