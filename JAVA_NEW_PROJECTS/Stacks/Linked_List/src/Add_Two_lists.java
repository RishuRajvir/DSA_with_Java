public class Add_Two_lists {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Values Of List2");
        Node<Integer> head2 = TakingInput.takeInput();
        Node<Integer> ans = add_lists(head, head2);
        System.out.println("Enter The Values Of Answer List is -> ");
        TakingInput.Lprint(ans);

    }
    private static Node<Integer> Rev(Node<Integer>head){
            if(head == null)
                return null;
            Node<Integer> cur = head;
            Node<Integer> prev = null;
            while(cur!=null){
                Node<Integer> next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            return  prev;
    }

    private static Node<Integer> add_lists(Node<Integer> head, Node<Integer> head2) {
            head = Rev(head);
            head2 = Rev(head2);
        Node<Integer> l1 = head;
        Node<Integer> l2 = head2;
        int carry = 0;
        Node<Integer> newhead = null;
        Node<Integer> newtail = null;


        while(l1!=null || l2!=null || carry!=0){
                int sum = 0;
                if(l1!=null){
                    sum+=l1.data;
                    l1=l1.next;
                }
                 if(l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }
                 sum+=carry;
                 int value = sum%10;
                 carry = sum/10;
                 Node<Integer> newnode = new Node<>(value);
                 if(newhead == null){
                     newhead = newnode;
                     newtail = newnode;

                 }else {
                     newtail.next = newnode;
                     newtail = newnode;
                 }
        }
        return Rev(newhead);
    }
}
