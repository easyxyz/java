package queue;

public class quaclient {

    public static void main(String[] args) throws Exception {

        queueusingarray qua = new queueusingarray();

        qua.enqueue(10);
        qua.enqueue(20);
        qua.enqueue(30);

        qua.display();

        System.out.print("Dequeue : ");
        System.out.println(qua.dequeue());

        qua.enqueue(40);

        System.out.println(qua.front());
        System.out.println(qua.rear());

        qua.display();

    }

}
