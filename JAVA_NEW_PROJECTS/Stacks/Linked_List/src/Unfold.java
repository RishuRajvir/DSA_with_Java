public class Unfold {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
            unfold(head1);
            TakingInput.Lprint(head1);
    }

    private static void unfold(Node<Integer> head1) {
        if(head1==null || head1.next == null){
            return;
        }
        Node<Integer> fh = head1;
        Node<Integer> sh = head1.next;

        Node<Integer> fp = fh;
        Node<Integer> sp = sh;

        while(sp!=null && sp.next!=null){

            Node<Integer> f = sp.next;
            fp.next = f;
            sp.next = f.next;


            fp = fp.next;
            sp = sp.next;
        }

        sh = rev(sh);
        fp.next = sh;
    }

    private static Node<Integer> rev(Node<Integer> head) {
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while(curr!=null){
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
