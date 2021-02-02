import java.util.Scanner;
public class PositionOfElement {
    /*Given an array of non-negative integers, write a code to search the position of an element in the array
    in the reverse order. Do not print anything when the element is not present in the given array.
     Also, if the key is repeated, print the index where the key is appearing for the first time in reverse order.
     The code should :
    Take the size of the array as an input from the user.
    The elements of the array as an input from the user.
    The key you are searching for, as an input from the user.*/

        public static void main(String args[]){
            //Declare the array here
            int count;
            int i;

            Scanner input = new Scanner(System.in);
            count = input.nextInt();
            int array[] = new int[count];

            for (i = 0; i < count; i++) {
                array[i] = input.nextInt();
            }

            int key = input.nextInt();
            input.close();
            int result=0;
            for (i = 0; i < count; i++) {
                if (array[i] == key) {
                    result = (count-1)-i;
                }
            }
            if (result>=0) System.out.println(result);

        }
}