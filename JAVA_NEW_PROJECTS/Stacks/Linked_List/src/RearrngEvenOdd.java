public class RearrngEvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
       head =  removeodd(head);
        TakingInput.Lprint(head);
    }
    public static Node<Integer> removeodd(Node<Integer> head){
        if (head == null) {
            return null;
        }

        Node<Integer> dummy = new Node<Integer>(0);
        dummy.next = head;
        Node<Integer> prev = dummy;
        Node<Integer> current = head;

        while (current != null) {
            if (current.data % 2 != 0) {
                // If the current position is odd, skip the current node
                prev.next = current.next;
            } else {
                // If the current position is even, move to the next node
                prev = current;
            }

            current = current.next;
//            position++;
        }

        return dummy.next;
    }
    private static void Arrange(Node<Integer> head) {
        Node<Integer>  headlarge = null;
        Node<Integer>  headsmall = null;
        Node<Integer>  tailsmall = null;
        Node<Integer>  taillarge = null;

        Node<Integer> curr = head;
        while(curr!=null){
            if(curr.data%2==0){
                if(headsmall==null){
                    headsmall = curr;
                    tailsmall = curr;
                }
                else {
                    tailsmall.next = curr;
                    tailsmall = curr;
                }

            }
            else{
                if(headlarge==null){
                    headlarge = curr;
                    taillarge = curr;
                }
                else{
                    taillarge.next = curr;
                    taillarge = curr;
                }
            }
            curr = curr.next;
        }
        taillarge.next = null;
        tailsmall.next = headlarge;
        Node<Integer> currnode = headsmall;
        while(currnode!=null){
            System.out.print(currnode.data+" ");
            currnode = currnode.next;
        }
    }
}
