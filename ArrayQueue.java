public class ArrayQueue <T> implements Queue{

    int front, rear, size; 
    int capacity; 
    T arr[]; 

    private boolean isFull(){
        return(size == capacity);
    }

    public ArrayQueue(){
        this(500);
    }

    public ArrayQueue(int size){
        this.size = 0; 
        this.front = 0; 
        this.arr = (T[]) new Object[size];
        this.rear = capacity-1; 
        this.capacity = size; 
        
    }

    public T dequeue() throws Exception {
        if (empty()) 
            throw new Exception("This is trash.");
           
        T item = this.arr[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return item; 
    }

    public void enqueue(Object item){
        if (isFull()) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.arr[this.rear] = (T) item; 
        this.size = this.size + 1; 
    }

    public boolean empty(){
        return (size == 0);
    }
}
