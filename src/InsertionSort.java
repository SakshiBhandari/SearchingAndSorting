public class InsertionSort {

    public static void insertSort(int[] arr){
        int comp = 0;
        for( int i =1 ;i<arr.length;i++){
            int v = arr[i];
            int  j= i;

            while(j>=1 && arr[j-1]>v){
                if(arr[j-1]>arr[j]){
                    comp = comp +1;
                }
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=v;
        }
        System.out.println(comp);
    }

    public static void main(String[] args) {
        int arr[] = {6,9,8,7};
        insertSort(arr);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}