import java.util.Scanner;
/*You are given a linked list consisting of just 0s, 1s and 2s. You need to return the sorted linked list.
Input Format:
The input contains the number of elements in the linked list, followed by the elements in the linked list.*/

    class LinkedList
    {
        Node head;

        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }

        void sortList()
        {
            //Write code here
            // initialise count of 0 1 and 2 as 0
            int count[] = {0, 0, 0};

            Node ptr = head;

            /* count total number of '0', '1' and '2'
             * count[0] will store total number of '0's
             * count[1] will store total number of '1's
             * count[2] will store total number of '2's  */
            while (ptr != null)
            {
                count[ptr.data]++;
                ptr = ptr.next;
            }

            int i = 0;
            ptr = head;

            /* Let say count[0] = n1, count[1] = n2 and count[2] = n3
             * now start traversing list from head node,
             * 1) fill the list with 0, till n1 > 0
             * 2) fill the list with 1, till n2 > 0
             * 3) fill the list with 2, till n3 > 0  */
            while (ptr != null)
            {
                if (count[i] == 0)
                    i++;
                else
                {
                    ptr.data= i;
                    --count[i];
                    ptr = ptr.next;
                }
            }
        }

        public void push(int new_data)
        {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        void printList()
        {
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

public class SortLinkedList012
    {
        public static void main(String args[])
        {
            int n;
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            LinkedList li = new LinkedList();

            for(int i = 0; i < n; i++)
            {
                int a;
                a = s.nextInt();
                li.push(a);
            }

            li.sortList();
            li.printList();
        }
    }

