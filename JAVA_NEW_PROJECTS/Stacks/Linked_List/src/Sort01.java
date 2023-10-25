public class Sort01 {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        head = Sort(head);
        TakingInput.Lprint(head);
    }

    private static Node<Integer> Sort(Node<Integer> head) {
            Node<Integer> curr = head;
            int zero = 0;
            while(curr!=null){
                if(curr.data == 1)
                    ;
                if(curr.data == 0)
                    zero++;
                curr = curr.next;
            }
           curr = head;
            while( curr!=null ) {
                if (zero>0) {
                    curr.data = 0;
                    zero--;
                } else {
                    curr.data = 1;

                }
                curr = curr.next;
            }
    return  head;
    }
}
