package stacktoqueue;

/**
 * Created by ty on 2017/5/6.
 */
public class Main {
    public static void main(String[] args) {
        Test<Integer> t = new Test<Integer>();
        t.enQueue(1);
        System.out.println(t);
        t.enQueue(2);
        t.enQueue(3);
        System.out.println(t);
        t.enQueue(4);

        System.out.println(t);
        t.deQueue();
        System.out.println(t);
        t.deQueue();
        System.out.println(t);
    }
}
