package stack;

public class sullclient {

    public static void main(String[] args) throws Exception {

        stackusingll sull = new stackusingll();

        sull.push(10);
        sull.push(20);
        sull.push(30);
        sull.push(40);

        System.out.println(sull.pop());

        System.out.println(sull.top());

    }

}
