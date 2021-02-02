import java.util.Scanner;
public class WordQuickSort {
    /*
    Write a program in Java that takes an array of strings as input and returns the sorted array.
    Assume that the sorting needs to be done based on the size of each string. So, a string with fewer
    characters should come before another string with more number of characters. Use the quicksort algorithm for the program.

Sample Input - 1:
7
Christene
Tomas
Marline
Marcelluss
Michelle
Quiana
Keny

So, the first input is the number of elements in the array. In this case, the number of elements is 7.
Next 7 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length.
The name with fewer characters comes before the names with more characters.

Sample Input - 1:
3
Cat
Tree
Bag

So, the first input is the number of elements in the array. In this case, the number of elements is 3.
Next 3 inputs are the elements inside the array. As you can see in the output, the names are sorted as per their length.

Please note that Quick Sort is an unstable sorting algorithm. So, the words with same number of characters may come in a different
sequence for different people depending upon the factors outside our control. */

    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }

    }
    //Write your code here
    public static int partition(String array[], int left, int right) {
        String x = array[right];
        int i = left - 1;
        for (int j = left; j <= right - 1; j++) {
            if (array[j].length() <= x.length()) {
                i++;
                String tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
        // swap
        String swap = array[i + 1];
        array[i + 1] = array[right];
        array[right] = swap;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        String array[] = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next();
        }

        // Sort in ascending order
        quickSort(array, 0, array.length - 1);

        for (String i : array) {
            System.out.println(i);
        }
    }
}

