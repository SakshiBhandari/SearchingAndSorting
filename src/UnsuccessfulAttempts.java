import java.util.*;
public class UnsuccessfulAttempts {
    /*Write a code that returns the number of unsuccessful attempts made to search for an element in the array using Binary search. The code should
    Take the size of the array as an input from the user
    The elements of the array as an input from the user
    The key you are searching for as an input from the user */
    public int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here

        int l = 0;
        int r = inputArr.length - 1;
        int count = 0;
        while (l <= r) {
            int mid = l + (r-l) /2;
            if (key == inputArr[mid]) {
                return count;
            }
            //Increment the unsuccessful comparison count here.
            count++;
            if (key < inputArr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return count;
    }
        public static void main(String args[] ) throws Exception {
            UnsuccessfulAttempts bs = new UnsuccessfulAttempts();
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }
            int key = scanner.nextInt();
            System.out.println(bs.getBinarySearchUnsuccessfulComparisonCount(array, key));
        }
    }


