public class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
        next = null;
    }
}
class Linked_list{
    public  static  void  main(String[] args){
            Node<Integer> Head = new Node<>(10);
            Node<Integer> node1 = new Node<>(20);
            Node<Integer> node2 = new Node<>(30);
            Node<Integer> node3 = new Node<>(40);
            Node<Integer> node4 = new Node<>(50);
        Head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        LLprint(node1);
    }
    public static void LLprint(Node<Integer>head){
        for(Node<Integer> i = head; i!=null; i=i.next) {
            System.out.println(head.data);

        }
    }
}
