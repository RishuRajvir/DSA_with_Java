import java.util.Scanner;
public class RemoveNthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Position");
        int n = sc.nextInt();
        head = Remove(head,n);
        TakingInput.Lprint(head);
    }

    private static Node<Integer> Remove(Node<Integer> head, int n) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        for(int i = 1; i<=n; i++){
            fast = fast.next;
        }
        if(fast==null)
            return head;
        while (fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return  head;

    }

}
