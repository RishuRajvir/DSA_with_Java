public class Partition {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        partition(head,3);
    }
    public  static  void  partition(Node<Integer>head, int x){
        Node<Integer>  headlarge = null;
        Node<Integer>  headsmall = null;
        Node<Integer>  tailsmall = null;
        Node<Integer>  taillarge = null;

        Node<Integer> curr = head;
        while(curr!=null){
                if(curr.data<x){
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
