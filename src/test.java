import java.util.*;

public class test {

public static boolean checkSumOfTwoNumbers(int arr[], int num){
    for(int i =0; i < arr.length-1; i++){
        for(int j = i + 1;  j < arr.length; j++){
            if (num == arr[i] + arr[j]){
                return true;
            }
        }
    }
    return false;
}
    public static void main(String[] args){
        test t = new test();
        int arr[] = {1, 7, 8, 9, 1, 5};
        int num = 2;
//        Scanner s = new Scanner(System.in);
//        int number = s.nextInt();
//        int arr[] = new int[number];
//        for(int i = 0; i < number; i++) {
//            arr[i] = s.nextInt();
//        }
//        int num = s.nextInt();

        System.out.print(t.checkSumOfTwoNumbers(arr, num));
    }
}
