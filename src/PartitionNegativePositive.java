import java.util.*;
public class PartitionNegativePositive {
    /*You are given an array of n integers, both negative and positive. You need to partition them into two different arrays
    without directly comparing any element to 0, 1, -1 or any other fixed value. Consider 0 as a positive number.
    If arr[0] is a positive number, then print all the positive numbers in the given order in the first line of output and then all
    the negative numbers in the given order in the second line of output, vice - versa.
    Note:
    If the array contains only positive numbers then print the positive numbers in the first line and in the second line print
    “Array doesn't have negative numbers”.
    If the array contains only negative numbers then print the negative numbers in the first line and in the second line print
    “Array doesn't have positive numbers”.
    Input: The input should be in the following format:
    The first line should be the number of elements in the array.
    The second line should be n elements of array space separated.
    Output: The output should be in the following format:
    If arr[0] is a negative number, then print all the negative numbers in the given order in the first line of output and then all the
    positive numbers in the given order in the second line of output, vice - versa.
    Each element of each output line should be separated by a space.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
        static void partitionNegativeAndPositive ( int n, int[] arr){
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            // arr[0] is stored in list1
            list1.add(arr[0]);
            for (int i = 1; i < n; i++) {
                // If arr[i] and arr[0] has opposite signs store arr[i] in list2
                if ((arr[0] ^ arr[i]) < 0) {
                    list2.add(arr[i]);
                }
                // If arr[i] and arr[0] has same signs store arr[i] in list1
                else {
                    list1.add(arr[i]);
                }
            }
            // Printing elements in list1
            for (int i = 0; i < list1.size(); i++) {
                System.out.print(list1.get(i) + " ");
            }
            System.out.println();

            // Printing elements in list2
            if (list2.size() > 0) {
                for (int i = 0; i < list2.size(); i++) {
                    System.out.print(list2.get(i) + " ");
                }
            } else {
                if (arr[0] > -1) {
                    System.out.println("Array doesn't have negative numbers");
                } else
                    System.out.println("Array doesn't have positive numbers");
            }
        }
    }