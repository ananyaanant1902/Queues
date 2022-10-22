public class queue_arr{
    int[] arr;
    int cap;
    int front, rear;
    Queues(int cap){
        this.cap=cap;
        this.front=-1;
        this.rear=-1;
        this.arr=new int[cap];
    }

    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        return rear==cap-1;
    }

    public void enQueue(int data){
        if(isFull()){
            System.out.println("QUEUE OVERFLOW");
            return;
        }
        else{
            if(front==-1){
                front=0;
            }
            rear++;
            arr[rear]=data;
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("QUEUE UNDERFLOW");
            return;
        }
        else if(front>=rear){
                front=rear=-1;
            }
            else{
                for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
                }
                rear--;
        }
    }

    public void display(){

            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }

    }
    public void front(){
        System.out.println(arr[front]);
    }
    public void rear(){
        System.out.println(arr[rear]);
    }
    public static void main(String[] args){
        Queues q=new Queues(5);
        System.out.println(q.isEmpty());
        q.enQueue(34);
        q.enQueue(35);
        q.front();
        q.rear();
        q.enQueue(36);
        q.front();
        q.rear();
        q.enQueue(37);
        q.enQueue(38);
        q.front();
        q.rear();
        q.display();
        q.enQueue(39);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.display();
        q.deQueue();
        q.display();
        q.front();
        q.rear();
    }
}
