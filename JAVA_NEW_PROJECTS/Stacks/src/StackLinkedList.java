

                                //STACKS USING LINKED LIST //
class Node<T>{
    T data ;
    Node<T> next;
    public Node(T data){
        this.data = data;
        next = null;
    }
}

public class StackLinkedList<T> {
    private Node<T> head;
    private  int size;

    public StackLinkedList(){
        head = null;
        size = 0;
    }
    public  void push(T elem){
            Node<T> newnode = new Node<>(elem);
           newnode.next = head;
           head = newnode;
            size++;
    }
    public T pop(){
        T temp = head.data;
        head = head.next;
        size--;
        return  temp;
    }
    public  T peek(){
        return  head.data;
    }
    public  boolean isempty(){
         return  head == null;
    }
    public  int size(){
            return size;
    }

}
class StackUse {
    public static void main(String[] args) {
        StackLinkedList<Integer> stack = new StackLinkedList<>();
        for (int i = 0; i < 15; i++) {
            stack.push(i);

        }
        System.out.println(stack.size());
        System.out.println(stack.isempty());
        System.out.println(stack.peek());
        while (!stack.isempty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack.size());
        System.out.println(stack.isempty());
    }
}
