public class Merge_Sort {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
       head = merge_sort(head);
        TakingInput.Lprint(head);
    }

    private static Node<Integer> merge_sort(Node<Integer> head) {
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> midNode = middle(head),part2Head=null;
        part2Head=midNode.next;
        midNode.next=null;
        Node<Integer> head1 = merge_sort(head);
        Node<Integer> head2 = merge_sort(part2Head);
        return merge(head1,head2);
    }
    private static Node<Integer> middle(Node<Integer> head){
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return  slow;
    }
    public  static  Node<Integer>  merge(Node<Integer> h1 , Node<Integer> h2){
                if(h1 == null)
                    return h2;
                if(h2 == null){
                    return h1;
                }
        Node<Integer> curr = null;
                if(h1.data<=h2.data){
                    curr = h1;
                    curr.next = merge(h1.next,h2);
                }
                else {
                    curr = h2;
                    curr.next = merge(h1,h2.next);

                }
                return curr;
    }
}
