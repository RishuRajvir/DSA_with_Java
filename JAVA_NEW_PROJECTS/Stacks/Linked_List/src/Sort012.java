public class Sort012 {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        head = sort012(head);
        TakingInput.Lprint(head);
    }

    private static Node<Integer> sort012(Node<Integer> head) {
        Node<Integer> curr = head;
        int zero = 0;
        int one = 0;
        while(curr!=null){
            if(curr.data == 1)
                one++;
            if(curr.data == 0)
                zero++;
            if(curr.data == 2)
                ;
            curr = curr.next;
        }
        curr = head;
        while( curr!=null ) {
            if (zero>0) {
                curr.data = 0;
                zero--;
            }else if(one>0){
                curr.data = 1;
                one--;
            }else {
                curr.data = 2;
            }
            curr = curr.next;
        }
        return  head;
    }
}
