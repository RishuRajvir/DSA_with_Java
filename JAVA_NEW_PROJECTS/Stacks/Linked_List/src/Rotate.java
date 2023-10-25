import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Rotate No.");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        head1 = rotate(head1,s);
        TakingInput.Lprint(head1);
    }

    private static Node<Integer> rotate(Node<Integer> head1, int k ) {
        if(head1==null || k<=0)
                return head1;
            Node<Integer> n1 = head1;
            int n = count(head1);
            int steps = n-k-1;
            while(steps>0){
                n1 = n1.next;
                steps--;
            }
            Node<Integer> newhead = n1.next;
            n1.next = null;
            Node<Integer>temp = newhead;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = head1;

    return newhead;

    }

    private static int count(Node<Integer> head1) {
        Node<Integer> h = head1;
                int cnt = 0;
        while(h!=null){
            cnt++;
            h=h.next;
        }
        return cnt;
    }
}
