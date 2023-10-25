public class Interscetion {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        System.out.println("Enter The Values Of List2");
        Node<Integer> head2 = TakingInput.takeInput();
        int ans = intersect(head, head2);
        System.out.println(ans);
//        TakingInput.Lprint(ans);
    }
    private static int intersect(Node<Integer> ha, Node<Integer> hb) {
//        Node<Integer> h1 = head;
//        Node<Integer> h2 = head2;
//        int l1 = 0;
//        int l2 = 0;
//        while (h1!=null){
//            h1 = h1.next;
//            l1++;
//        }
//        while (h2!=null){
//            h2 = h2.next;
//            l2++;
//        }
//        h1 = head;
//        h1  = head;
//
//        if(l1>l2){
//            int steps = l1-l2;
//            for(int i = 1; i<=steps; i++){
//                h1 = h1.next;
//            }
//        }
//        else {
//            int steps = l2 - l1;
//            for (int i = 1; i <=steps; i++) {
//                    h2 = h2.next;
//            }
//        }
//        while (h1!=h2){
//            h2=h2.next;
//            h1 = h1.next;
//        }
//        return h1.data;
        Node<Integer> t1 = ha, t2 = hb;
        int la = 0 , lb = 0;
        while(t1!=null){
            t1=t1.next;
            la++;
        }
        while(t2!=null){
            t2=t2.next;
            lb++;
        }
        t1 = ha;
        t2 = hb;
        if(la>lb){
            int steps = la-lb;
            for(int i = 1; i<=steps; i++)
                t1 = t1.next;
        }
        else{
            int steps = lb-la;
            for(int i = 1; i<=steps; i++)
                t2 = t2.next;
        }
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }
        return t1.data;

    }

}
