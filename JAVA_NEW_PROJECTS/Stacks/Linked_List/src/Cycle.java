import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        System.out.println("Enter The Loop Position");
        int n = sc.nextInt();
        Node<Integer> head = MakeCycle(head1,n);
        System.out.println("The Cycle Starts from  " +cycleStart(head));
        head = Remove_cycle(head);


//        Boolean is = iscycle(head1);
//        System.out.println(is);
        TakingInput.Lprint(head);
        System.out.println("Cycle Removed SuccessFully!!");


    }

    private static Node<Integer> Remove_cycle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast= head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast.next == null)
            return head;
        slow = head;
        while (slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        while (slow!=fast.next){
            fast = fast.next;
        }
        fast.next = null;

        return head;

    }

    private static int cycleStart(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast= head;
        while (fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast.next == null)
            return 0;
        slow = head;
        while ((slow!=fast)){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.next.data;
    }

    private static Boolean iscycle(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while (fast!=null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                    if(slow == fast)
                        return true;
        }
        return  false;
    }

    public static Node<Integer> MakeCycle( Node<Integer> head, int pos){
       Node<Integer> slow = head;
        Node<Integer> temp = head;
        int i = 0;
        while(i<pos-1){
            slow = slow.next;
            i++;
        }
        Node<Integer> fast = slow;

        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = fast;
        return  head;
    }
}
