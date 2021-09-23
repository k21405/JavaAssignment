public class UserQueue {
    private int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize = 0;

    public UserQueue(int size) {
        this.capacity = size;
        front = 0;
        rear = -1;
        queueArr = new int[this.capacity];
    }


    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full!! Can not add more elements");
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue");
        }
    }


    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!! Can not dequeue element");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println(queueArr[front - 1] + " removed from the queue");
                front = 0;
            } else {
                System.out.println(queueArr[front - 1] + " removed from the queue");
            }
            currentSize--;
        }
    }
    
    public boolean isFull() {
        if (currentSize == capacity) {
            return true;
        }
        return false;
    }
    
    public boolean isEmpty() {

        if (currentSize == 0) {
            return true;
        }
        return false;
    }

    public static void main(String a[]) {

        UserQueue q1 = new UserQueue(6);
        q1.enqueue(1);
        q1.dequeue();
        q1.enqueue(30);
        q1.enqueue(44);
        q1.enqueue(32);
        q1.dequeue();
        q1.enqueue(98);
        q1.dequeue();
        q1.enqueue(70);
        q1.enqueue(22);
        q1.dequeue();
        q1.enqueue(67);
        q1.enqueue(23);
    }
}
