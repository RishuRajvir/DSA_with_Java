public class palindrome {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head1 = TakingInput.takeInput();
        int n = twinsum(head1);
        System.out.println(n);
//        Boolean is = ispalindrome(head1);
//        System.out.println(is);
    }

    private static int twinsum(Node<Integer> head) {
        if(head == null || head.next == null)
            return 0;
        int max = Integer.MIN_VALUE;
        Node<Integer> temp = null;
        Node<Integer> curr = head;
        temp = middle(curr);
        curr = Rev(temp);
        while(curr.next!=null){
            int sum = temp.data+curr.data;
            if(sum>max)
                max = sum;
            curr = curr.next;
        }
        return  max;
    }
    private static int twinsum1(Node<Integer> head) {
        int ans = 0;
        Node<Integer> slow = head;
        Node<Integer>fast = head;

        // Let slow point to the start of the second half
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Tail points to the end with reversed second half
        Node<Integer> tail = Rev(slow);

        while (tail != null) {
            ans = Math.max(ans, head.data + tail.data);
            head = head.next;
            tail = tail.next;
        }

        return ans;
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
    private static Boolean ispalindrome(Node<Integer> head) {
        if(head == null || head.next == null)
            return true;
        Node<Integer> temp = null;
        Node<Integer> curr = head;
        temp = middle(curr);
        curr = Rev(temp.next);
        while(curr.next!=null){
            if(temp.data!=curr.data)
                return false;
            curr = curr.next;
        }
        return  true;
    }

    private static Node<Integer> Rev(Node<Integer> head) {
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
