public class UserStack {
    int size;
    int arr[];
    int top;

    UserStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed element:" + element);
        } else {
            System.out.println("Stack is full !");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int topElement = top;
            top--;
            System.out.println("Popped element :" + arr[topElement]);
            return arr[topElement];

        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }

    public int peek() {
        if(!this.isEmpty())
            return arr[top];
        else
        {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public static void main(String[] args) {
        UserStack s1 = new UserStack(5);
        s1.pop();

        s1.push(100);
        s1.push(90);
        s1.push(10);
        s1.push(50);

        s1.pop();
        s1.pop();
        s1.pop();

    }
}
