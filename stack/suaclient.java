package stack;

public class suaclient {

    public static void main(String[] args) throws Exception {

        stackusingarray sua = new stackusingarray();

        sua.push(10);
        sua.push(20);
        sua.push(30);
        sua.push(40);
        sua.push(50);
        sua.push(60);

        sua.display();

        System.out.println(sua.pop());

        sua.display();

    }

}
