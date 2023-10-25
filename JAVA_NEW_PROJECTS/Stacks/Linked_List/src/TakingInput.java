import java.util.Scanner;

public class TakingInput {
    public static  Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer>head = null,tail = null;
        while(data!=-1){
            Node<Integer> newnode = new Node<>(data);
            if(head==null){
                head = newnode;
                tail = newnode;
            }else {
                tail.next = newnode;
                tail = newnode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public  static  void  main(String[] arg) {
        Node<Integer> head = takeInput();
        Lprint(head);
    }
    public static void Lprint(Node<Integer>head){
        while(head!=null){
            System.out.print(head.data+" ");
        head = head.next;
        }
    }
}
