import java.util.Scanner;

public class DeleteNodeByValue {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Rotate No.");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        head1 = delete(head1,s);
        TakingInput.Lprint(head1);
    }
    private  static  void val(Node<Integer>head){
        if(head == null || head.next == null)
                  return ;
        Node<Integer> n = head;
        n.data = n.next.data;
        n.next = n.next.next;
    }
    private static Node<Integer> delete(Node<Integer> head1, int s) {
            Node<Integer>h1 = head1;
            while(h1.next!=null){
                if(h1.data==s)
                    val(h1);
                h1 = h1.next;
            }
            return head1;
    }
}
