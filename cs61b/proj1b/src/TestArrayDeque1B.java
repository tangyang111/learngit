import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ty on 2017/4/28.
 */
public class TestArrayDeque1B {


    @Test
    public void testSize() {
        FailureSequence fs = new FailureSequence();
        StudentArrayDeque<Integer> sad = new StudentArrayDeque<Integer>();
        ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<Integer>();

        DequeOperation dequeOp1 = new DequeOperation("isEmpty");
        fs.addOperation(dequeOp1);
        assertEquals(fs.toString(), ads.isEmpty(), sad.isEmpty());

        DequeOperation dequeOp2 = new DequeOperation("addFirst", 1);
        fs.addOperation(dequeOp2);
        ads.addFirst(1);
        sad.addFirst(1);
        assertEquals(fs.toString(), ads.get(0), sad.get(0));

        DequeOperation dequeOp3 = new DequeOperation("removeLast");
        fs.addOperation(dequeOp3);
        assertEquals(fs.toString(), ads.removeLast(), sad.removeLast());

        DequeOperation dequeOp4 = new DequeOperation("removeFirst");
        fs.addOperation(dequeOp4);
        assertEquals(fs.toString(), ads.removeFirst(), sad.removeFirst());

        DequeOperation dequeOp5 = new DequeOperation("size");
        fs.addOperation(dequeOp5);
        assertEquals(fs.toString(), ads.size(), sad.size());

    }

/*    @Test
    public void testSize() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addFirst(1);
        sad1.addFirst(2);
        sad1.addFirst(3);
        int act1 = sad1.size();
        int exp1 = 3;
        assertEquals(exp1, act1);

        sad1.addLast(4);
        int act2 = sad1.size();
        int exp2 = 4;
        assertEquals(exp2, act2);

        sad1.removeFirst();
        int act3 = sad1.size();
        int exp3 = 3;
        assertEquals(exp3, act3);

        sad1.removeLast();
        int act4 = sad1.size();
        int exp4 = 2;
        assertEquals(exp4, act4);

        sad1.removeFirst();
        sad1.removeFirst();
        sad1.removeFirst();
        int act5 = sad1.size();
        int exp5 = 0;
        assertEquals(exp5, act5);


    }

    @Test
    public void testGet() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addFirst(1);
        sad1.addFirst(2);
        sad1.addFirst(3);
        int act1 = sad1.get(0);
        int exp1 = 3;
        assertEquals(exp1, act1);
        int act2 = sad1.get(1);
        int exp2 = 2;
        assertEquals(exp2, act2);
        int act3 = sad1.get(2);
        int exp3 = 1;
        assertEquals(exp3, act3);

        Integer act4 = sad1.get(4);
        Integer exp4 = null;
        assertEquals(exp4, act4);

        sad1.removeFirst();
        int act5 = sad1.get(0);
        int exp5 = 2;
        assertEquals(exp5, act5);

    }

    @Test
    public void testAddLast() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addFirst(1);
        sad1.addFirst(2);
        sad1.addFirst(3);
        sad1.addLast(4);
        int exp1 = 4;
        int act1 = sad1.get(3);
        assertEquals(exp1, act1);
    }

    @Test
    public void testRemoveLast() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addFirst(1);
        sad1.addFirst(2);
        sad1.addFirst(3);
        sad1.addLast(4);
        sad1.removeLast();
        int exp1 = 1;
        int act1 = sad1.get(2);
        assertEquals(exp1, act1);
        Integer exp2 = null;
        Integer act2 = sad1.get(3);
        assertEquals(exp2, act2);

    }


    @Test
    public void test() {
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<Integer>();
        sad1.addFirst(3);
        sad1.addFirst(2);
        sad1.addFirst(1);

    }*/
}
