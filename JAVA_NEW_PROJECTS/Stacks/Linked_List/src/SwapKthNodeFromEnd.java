import java.util.Scanner;

public class SwapKthNodeFromEnd {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Rotate No.");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        head1 = swap(head1,s);
        TakingInput.Lprint(head1);
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
    private static Node<Integer> swap(Node<Integer> head1, int K) {
        Node<Integer>h1 = head1;
        Node<Integer>h2 = head1;
        int n = count(head1);
        int steps = K-1;
        while ((steps>0)){
            h1=h1.next;
            steps--;
        }
        steps = n-K;
        while ((steps>0)){
            h2=h2.next;
            steps--;
        }
        int temp = h1.data;
        h1.data = h2.data;
        h2.data = temp;

        return head1;

    }
}
