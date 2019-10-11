public class ArrayStack <T> implements Stack {

    private int top; 
    private int size; 
    private T[] arr; 
    
    public ArrayStack(){
        this(500);
    }    


    public ArrayStack(int size){
        this.size = size; 
        this.top = -1; 
        this.arr = (T[]) new Object[size];

    }

    public T pop() throws Exception {
        if(empty()){
            throw new Exception("Stack is empty");
        }else{
            return arr[top--];
        }
    }

    public T peek() throws Exception{
        if(empty()){
            throw new Exception("EMPTY");
        }
        return arr[top];
    }

    public void push(Object item){
        arr[++top] = (T) item; 
    }

     public boolean empty(){
        return top < 0; 
    }
}