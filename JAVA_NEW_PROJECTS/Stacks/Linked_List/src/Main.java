import java.util.*;
import java.lang.*;

class Node1{
    int data;
    Node1 next;
}
class Main{
    public static Node1 newNode(int data){
        Node1 temp = new Node1();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public static void makeLoop(Node1 head, int x){
        if (x == 0)
            return;
        Node1 curr = head;
        Node1 last = head;

        int currentPosition = 1;
        while (currentPosition < x)
        {
            curr = curr.next;
            currentPosition++;
        }

        while (last.next != null)
            last = last.next;
        last.next = curr;
    }


    public static int length(Node1 head){
        int ret=0;
        while(head!=null){
            ret += 1;
            head = head.next;
        }
        return ret;
    }
    public static void printList(Node1 node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        Node1 head = newNode(num);
        Node1 tail = head;
        for(int i=0; i<n-1; i++){
            num = sc.nextInt();
            tail.next = newNode(num);
            tail = tail.next;
        }
        int pos = sc.nextInt();
        makeLoop(head, pos);
        Solution x = new Solution();
        Solution.removeLoop(head);
        if( detectLoop(head) || length(head)!=n )
            System.out.println("-1");
        else
            printList(head);

    }
    public  static  Boolean  detectLoop(Node1 head){
        Node1 slow = head;
        Node1 fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
               return  true;
        }
        return false;
    }
}

class Solution{
    public static void removeLoop(Node1 head){
        Node1 slow = head;
        Node1 fast= head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast.next == null)
            return;
        slow = head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        while (slow!=fast.next){
            fast = fast.next;
        }
        fast.next = null;

    }

}
