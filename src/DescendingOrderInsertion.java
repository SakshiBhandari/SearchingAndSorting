import java.util.Scanner;
//Write a program in Java that can return an array in descending order of elements using insertion sort.
//The program will take the size of the array and the elements of the array as inputs.
public class DescendingOrderInsertion {
    public static void insertionSortDescending(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] < key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort in descending order
        insertionSortDescending(array);
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
