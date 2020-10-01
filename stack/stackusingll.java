package stack;

public class stackusingll {

    private class Node {
        int data;
        Node next;

        Node(int data, Node Next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node tos;
    private int size;

    public stackusingll() {
        this.tos = null;
        this.size = -1;
    }

    public int size() {
        return this.size + 1;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void push(int data) {
        Node node = new Node(data, this.tos);
        this.tos = node;
        this.size++;
    }

    private Node getNodeAt(int index) throws Exception {
        if (index < 0 || index >= this.size()) {
            throw new Exception("Invalid Index...");
        }

        int counter = 0;
        Node temp = this.tos;
        while (counter != index) {
            temp = temp.next;
            counter++;
        }

        return temp;

    }

    public int top() throws Exception {
        return this.getNodeAt(this.size() - 2).data;
    }

    public int pop() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is Empty...");
        }

        Node temp = tos;
        tos = tos.next;
        this.size--;
        return temp.data;
    }

}
