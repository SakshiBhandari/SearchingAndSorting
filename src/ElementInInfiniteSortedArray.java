import java.util.Scanner;
public class ElementInInfiniteSortedArray {
/*Problem Statement:
Write the code to find the position of an element in a sorted array of infinite numbers. Since the array is infinite,
you cannot know the size of the array.
Input Format:
The input contains a number of elements in the input array followed by array elements, followed by the element to be searched.
Output Format:
The output contains the position of the element (if the element is found) or -1 (if the element is not found)
Sample Test Cases:
Input
20 5 10 11 13 17 20 24 34 36 49 52 55 57 61 64 70 71 74 84 93
71
*/
        static int binarySearch(int arr[], int low, int high, int key)
        {
            /* This function implements Binary Search */
            if (high>=low)
            {
                int mid = low + (high - low)/2;
                if (arr[mid] == key)
                    return mid;
                if (arr[mid] > key)
                    return binarySearch(arr, low, mid-1, key);
                return binarySearch(arr, mid+1, high, key);
            }
            return -1;
        }

        static int infiniteArray(int arr[], int key)
        {
        /* This function returns the position of the
           element (if found) or -1 (if not found) */
            int low = 0, high = 1;
            int val = arr[0];

            // Find h to do binary search
            while (val < key)
            {
                low = high;     // store previous high
                //check that 2*h doesn't exceeds array
                //length to prevent ArrayOutOfBoundException
                if(2*high < arr.length-1)
                    high = 2*high;
                else
                    high = arr.length-1;

                val = arr[high]; // update new val
            }

            return binarySearch(arr, low, high, key);
        }

        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            int key;
            key = s.nextInt();

            System.out.println(infiniteArray( arr, key ) + "\n" );
        }
    }
