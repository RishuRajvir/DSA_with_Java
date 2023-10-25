
import java.util.*;
public class TakeInput2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Linked_List ll = new Linked_List();
        for (int i = 0; i < n; i++) {
                int data = sc.nextInt();
                ll.addNode(data);

        }
    }
}
class Linked_List{
    Node head;
    Node tail;
    public  void addNode(int data){
        Node newnode = new Node(data);
        if(head == null && tail == null){
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }
    public void printLL(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }
}

