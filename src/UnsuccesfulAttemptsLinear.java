import java.util.*;
public class UnsuccesfulAttemptsLinear {
    /*Write a code that returns the number of unsuccessful attempts made to search for an element in the array using linear search.
The code should
Take the size of the array as an input from the user
The elements of the array as an input from the user
The key you are searching for as an input from the u*/

    public int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int count = 0;
        int size = inputArr.length;
        for (int i = 0; i < size; i++) {
            if (inputArr[i] == key) {
                return count;
            }
            count++;
        }
        return count;
    }
    public static void main(String a[]) {
        UnsuccesfulAttemptsLinear al = new UnsuccesfulAttemptsLinear();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(al.getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}
