import java.util.Scanner;
public class SumCloseToZero {
    /*You are given an array. The array can contain positive and negative integers. You need to find two elements such that
    their sum is closest to zero. For example, you are given an array {-4, 7, 6, 2, -5}. The two elements with the sum closest
    to zero will be -5 and 6. Input Format:
    The input contains the number of elements in the array, followed by the elements in the array.*/

        static void sumClosestToZero(int arr[], int n) {
            //Write code here
            /* Start looking for the pair  */
            int sum = 0;
            int l = 0;
            int r = n - 1;
            int min_sum = arr[l] + arr[r];
            int min_l = l;
            int min_r = r;

            if(n < 2)
            {
                System.out.println("Invalid Input");
                return;
            }

            /* Sort the elements */
            sort(arr, l, r);


            while (l < r) {
                sum = arr[l] + arr[r];

                /*If abs(sum) is less then update the result items*/
                if (Math.abs(sum) < Math.abs(min_sum)) {
                    min_sum = sum;
                    min_l = l;
                    min_r = r;
                }
                if (sum < 0)
                    l++;
                else
                    r--;

            }
            System.out.println(arr[min_l] + " " + arr[min_r]);
        }
    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
        public static void main (String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = s.nextInt();

            sumClosestToZero(arr, n);
        }
    }

    /*
     int sum, min_sum = Integer.MAX_VALUE;
        int l = 0, r = n-1;

        int min_l = l, min_r = n-1;

        if(n < 2)
        {
            System.out.println("Invalid Input");
            return;
        }

        Arrays.sort(arr);

        while(l < r)
        {
            sum = arr[l] + arr[r];
            if(Math.abs(sum) < Math.abs(min_sum))
            {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }

            if(sum < 0)
                l++;
            else
                r--;
        }
        System.out.println(arr[min_l] + " " + arr[min_r]);
    }
     */