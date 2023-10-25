import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Value ");
        int n = sc.nextInt();
        System.out.println("Enter The Position ");
        int m = sc.nextInt();
        Node<Integer> ans = RecIns(head,n,m);
        System.out.println("Enter The Values Of Answer List is -> ");
        TakingInput.Lprint(ans);

    }

    private static Node<Integer> insert(Node<Integer> head, int val, int pos) {
                 Node<Integer> newnode = new Node<>(val);
                 if(pos == 0){
                    newnode.next = head;
                    return newnode;
                }
                int i = 0;
                 Node<Integer>temp = head;
                while(temp.next!=null&&i<pos-1){
                        temp = temp.next;
                        i++;
                }
                newnode.next = temp.next;
                temp.next = newnode;
                return head;
    }
    private  static  Node<Integer> RecIns(Node<Integer> head, int val, int pos){
            if(head == null && pos<0)
                return head;
            if(pos-1 == 0){
                Node<Integer> newnode = new Node<>(val);
                newnode.next = head;
                return newnode;
            }
            else {
                head.next = RecIns(head.next, val, pos-1);
                return head;
            }
    }
}
