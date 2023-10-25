
                                    // STACKS USING ARRAYS
public class StacksArrays {
    private int[] data;
    private  int top;
    public  StacksArrays(){
        data = new int[1];
        top = -1;
    }
    public int size(){
        return top+1;
    }
    public boolean isEmpty(){
        return  top == -1;
    }
    public  void push(int elem){
        if(top==data.length-1){
           DoubleCapacity();
        }
        data[++top] = elem;
    }
 private void DoubleCapacity() {
        int[] temp = data;
        data = new int[temp.length*2];
     for(int i = 0; i < temp.length; i++) {
         data[i] = temp[i];
     }

 }

public int top() throws StackOverflowError{
        if(size() == 0){
            System.out.println("Stack is Empty");
            return 0;
        }
        return data[top];
    }
    public  int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return 0;
        }
        return data[top--];
    }
}
class UsingArrays{
    public static void main(String[] args) {
            StacksArrays stack = new StacksArrays();
//        System.out.println(stack.isEmpty());
//        stack.push(10);
//        stack.push(18);
//        stack.push(16);
//        stack.push(14);
//        stack.push(15);
//        System.out.println(stack.size());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.pop());
//        System.out.println(stack.size());
//        System.out.println(stack.top());
        for (int i = 1; i <=100 ; i++) {
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
