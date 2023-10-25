import java.util.Objects;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("Enter The Values Of List1");
        Node<Integer> head = TakingInput.takeInput();
        System.out.println();
        head = ConsecutiveDuplicates(head);
        TakingInput.Lprint(head);
    }

    private static Node<Integer> ConsecutiveDuplicates(Node<Integer> head) {
        Node<Integer> curr = head;
//        Node<Integer> next = head.next;
        while (curr.next!= null) {
            if (Objects.equals(curr.data, curr.next.data)) {
                curr.next = curr.next.next;
//                next = next.next;
            } else {
                curr = curr.next;
//                next = next.next;
            }

        }
        return head;
    }
}

