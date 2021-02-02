import java.util.*;
public class DescendingOrderMerge {
    /*Write a code that sorts an array in decreasing order using Merge Sort algorithm.
    Note that the array in the question which needs to be sorted is named as "randomNumbers".
    You need to sort the numbers inside the "randomNumbers" array and store the sorted array inside the "sortedNumbers" array
    Input:
    1. The first input is 'n', that is, the number of elements in the array.
    2. In the next line, n elements of the array space-separated
    Output:
    The array sorted in decreasing order.
    Sample Test Case-1
Sample Input-1:
8
9 45 76 23 47 1 5 11

Sample Output-1
[76,47,45,23,11,9,5,1]
The first input is n (number of elements in the array), here it is 8. The next line in the input represents the
elements of the array (space-separated). The output is the same array arranged in decreasing order.*/


    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSort(numbers, first, mid);
            mergeSort(numbers, mid + 1, last);

            merge(numbers, first, mid, last);
        }

        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j) {
        int l = i; //inital index of first subarray
        int r = m + 1; // initial index of second subarray
        int k = 0; // initial index of merged array
        int[] t = new int[numbers.length];

        while (l <= m && r <= j) {
            if (numbers[l] >= numbers[r]) {
                t[k] = numbers[l];
                k++;
                l++;
            } else {
                t[k] = numbers[r];
                k++;
                r++;
            }
        }

        // Copy the remaining elements on left half , if there are any
        while (l <= m) {
            t[k] = numbers[l];
            k++;
            l++;
        }

        // Copy the remaining elements on right half , if there are any
        while (r <= j) {
            t[k] = numbers[r];
            k++;
            r++;
        }

        // Copy the remaining elements from array t back the numbers array
        l = i;
        k = 0;
        while (l <= j) {
            numbers[l] = t[k];
            l++;
            k++;
        }

        return numbers;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
