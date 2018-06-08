public class Main {

    public static void main(String[] args) {
        Network x = new Network(10);
        x.connect(1,4);
        x.connect(4,7);
        x.connect(1,4);

        System.out.println(x.query(1,7));
        System.out.println(x.query(1,10));

        x.connect(10,7);

        System.out.println(x.query(1,10));
    }
}
