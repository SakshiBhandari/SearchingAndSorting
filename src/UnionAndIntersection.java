import java.util.*;
/*You are given two unsorted arrays. Elements in each array are distinct. Determine the union and intersection of the two arrays.
Input Format:
The first line of the input contains the number of elements in the first array, followed by the elements in the first array.
The second line of the input contains the number of elements in the second array, followed by the elements in the second array
Output Format:
The first line of the output contains the union of the two arrays. The second line of the output contains the intersection of the two arrays.
Sample Test Cases:
Input:
6 5 7 8 6 4 2
5 3 2 4 9 8
*/
public class UnionAndIntersection {

        static void union(int arr1[], int arr2[], int m, int n)
        {
            //Write code here
            // Before finding union, make sure arr1[0..m-1]
            // is smaller
            if (m > n) {
                int tempp[] = arr1;
                arr1 = arr2;
                arr2 = tempp;

                int temp = m;
                m = n;
                n = temp;
            }

            // Now arr1[] is smaller
            // Sort the first array and print its elements
            // (these two steps can be swapped as order in
            // output is not important)
            Arrays.sort(arr1);
            for (int i = 0; i < m; i++)
                System.out.print(arr1[i] + " ");

            // Search every element of bigger array in smaller
            // array and print the element if not found
            for (int i = 0; i < n; i++) {
                if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
                    System.out.print(arr2[i] + " ");
            }
        }

    static void intersection(int arr1[], int arr2[], int m, int n)
        {
            //Write code here
            if (m > n) {
                int tempp[] = arr1;
                arr1 = arr2;
                arr2 = tempp;

                int temp = m;
                m = n;
                n = temp;
            }

            // Now arr1[] is smaller
            // Sort smaller array arr1[0..m-1]
            Arrays.sort(arr1);

            // Search every element of bigger array in smaller
            // array and print the element if found
            for (int i = 0; i < n; i++) {
                if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1)
                    System.out.print(arr2[i] + " ");
            }
        }
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle
            // itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can
            // only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in
        // array
        return -1;
    }

        public static void main(String[] args)
        {
            int m;
            Scanner s = new Scanner(System.in);
            m = s.nextInt();
            int arr1[] = new int[m];
            for(int i = 0; i < m; i++)
                arr1[i] = s.nextInt();

            int n;
            n = s.nextInt();
            int arr2[] = new int[n];
            for(int i = 0; i < n; i++)
                arr2[i] = s.nextInt();

            union(arr1, arr2, m, n);
            System.out.print("\n");
            intersection(arr1, arr2, m, n);
        }
    }
