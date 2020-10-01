package stack;
/*
*
* Stack Stands for 
* Last In-First Out(LIFO)
*           or
* First In-Last Out(FILO)
*
*/

public class stackusingarray {

    public int[] data;
    public int tos;

    public static final int Capacity = 10;

    public stackusingarray() throws Exception {
        this(Capacity);
    }

    public stackusingarray(int capacity) throws Exception {
        if (capacity < 0) {
            throw new Exception("Invalid Capacity");
        }

        this.data = new int[capacity];
        this.tos = -1;

    }

    public int size() {
        return this.tos + 1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(int data) throws Exception {
        if (this.size() == this.data.length) {
            throw new Exception("Stack is Full...");
        }

        this.tos++;
        this.data[this.tos] = data;
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty...");
        }

        int rv = this.data[this.tos];
        this.data[this.tos] = 0;
        this.tos--;
        return rv;

    }

    public int top() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty...");
        }

        return this.data[this.tos];
    }

    public void display() {
        for (int i = this.tos; i >= 0; i--) {
            System.out.print(this.data[i] + ", ");
        }

        System.out.println("End");
    }

}
