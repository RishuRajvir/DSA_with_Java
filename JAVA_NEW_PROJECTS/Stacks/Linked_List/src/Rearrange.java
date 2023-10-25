public class Rearrange {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        head = Arrange(head);
        TakingInput.Lprint(head);

    }

    private static Node<Integer> Arrange(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node<Integer> node1 = head;
        Node<Integer> node2 = slow.next;
        slow.next = null;

        node2 = Rev(node2);
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> curr = dummy;
        while (node1 != null || node2 != null) {
            if (node1 != null) {
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;

            }
            if (node2 != null) {
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;

            }
        }
        dummy = dummy.next;
        return dummy;
    }

    private static Node<Integer> Rev(Node<Integer> head) {
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while (curr != null) {
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
