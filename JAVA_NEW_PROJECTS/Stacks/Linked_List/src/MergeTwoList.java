public class MergeTwoList {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Values Of List 2");
        head1 = copy(head1);
//        Node<Integer> head2 = TakingInput.takeInput();
//        Node<Integer> head3 = Merge(head1, head2);
        TakingInput.Lprint(head1);
    }

    public  static  Node<Integer> copy(Node<Integer>head){
            Node<Integer> newnode = new Node<>(0);
        Node<Integer>  curr = newnode;
            while(head!=null){
                curr.next = head;
                curr = head;
                head = head.next;
//                curr = curr.next;
            }
            return  curr;
    }

    private static Node<Integer> Merge(Node<Integer> head1, Node<Integer> head2) {
        if(head1 == null){
            return  head2;
        }
        if(head2 == null){
            return head1;
        }
        Node<Integer> curr = null;
        if(head1.data <= head2.data){
                curr  = head1;
                curr.next = Merge(head1.next,head2);
        }
        else {
            curr = head2;
            curr.next = Merge(head1,head2.next);

        }
        return curr;
    }
}
