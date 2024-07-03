//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        // code here
          if(head == null || head.next ==null){
            return head;
        }
        Node temp=head;
        Node prev=null;
        
        Node temp2=null;
        while(temp.next  != null){
            if(temp.data == temp.next.data){
                temp.data=temp.next.data;
                temp.next=temp.next.next;
                prev=new Node(temp.data);
            }
            else{
                 if(prev != null){
                    temp.data=temp.next.data;
                    temp.next=temp.next.next;
                    prev=null;
                 }
                 else{
                     temp2=temp;
                     temp=temp.next;
                 }
            }
        }
        
        if(prev != null){
            temp2.next=null;
        }
        return head;
    }
}