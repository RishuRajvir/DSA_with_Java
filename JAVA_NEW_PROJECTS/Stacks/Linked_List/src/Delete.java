import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Value ");
        int n = sc.nextInt();
//        System.out.println("Enter The Position ");
//        int m = sc.nextInt();
        Node<Integer> ans = delete1(head,n);
        System.out.println("Enter The Values Of Answer List is -> ");
        TakingInput.Lprint(ans);

    }

    private static Node<Integer> delete1(Node<Integer> head, int n) {
//        Node<Integer> newnode = new Node<>(0);
            Node<Integer> cur = head;
//            Node<Integer> node = newnode;
            while(cur.next!=null){
                if(cur.data==n){
//                    node.next = cur;
//                    node = node.next;
                    cur.next = cur.next.next;

                }else {
                    cur = cur.next;

                }
            }
            return head;
    }

    private static Node<Integer> delete(Node<Integer> head, int pos) {
            if(head == null)
                    return head;
            if(pos==0)
                    return head.next;
            int i = 0;
            Node<Integer>temp = head;
            while(i<pos-1 && temp!=null){
                temp = temp.next;
                i++;
            }
            if(temp == null || temp.next == null ){
                return head;
            }
            temp.next = temp.next.next;
            return  head;
    }

    private static Node<Integer> delete(Node<Integer> head) {
            if(head == null || head.next == null)
                    return null;
        Node<Integer> n = head;
        n.data = n.next.data;
        n.next = n.next.next;
            return  n;
    }
}

