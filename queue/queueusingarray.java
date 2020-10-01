package queue;

/**
 * queueusingarray
 */

/*
 *
 * Queue stands for First In-First Out (FIFO)
 * 
 */
public class queueusingarray {

    private int[] data;
    private int front;
    private int rear;
    private int size;

    public static final int Capacity = 10;

    public queueusingarray() throws Exception {
        this(Capacity);
    }

    public queueusingarray(int capacity) throws Exception {
        if (capacity <= 0) {
            throw new Exception("Invalid Capacity");
        }

        this.data = new int[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;

    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void enqueue(int data) throws Exception {

        if (this.size() == this.data.length) {
            throw new Exception("Queue is full...");
        }

        if (this.isEmpty()) {
            this.data[this.size()] = data;
            front = 0;
            rear = 0;
            size++;
        } else {
            this.data[this.size()] = data;
            rear = this.size();
            size++;
        }
    }

    public int dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue is Empty...");
        }

        int rv = this.data[this.front];
        this.data[this.front] = 0;
        this.front++;
        return rv;
    }

    public int front() {
        return this.data[this.front];
    }

    public int rear() {
        return this.data[this.rear];
    }

    public void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(this.data[i] + ", ");
        }

        System.out.println("End");
    }

}