import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ty on 2017/4/28.
 */
public class TestLinkedListDeque1B {
/*    @Test
    public void testSize() {
        StudentLinkedListDeque<Integer> sld1 = new StudentLinkedListDeque<Integer>();
        assertEquals(0, sld1.size());
        sld1.addFirst(1);
        assertEquals(1, sld1.size());
        sld1.addLast(1);
        assertEquals(2, sld1.size());
        sld1.removeFirst();
        assertEquals(1, sld1.size());
        sld1.removeLast();
        assertEquals(0, sld1.size());
        sld1.removeFirst();
        assertEquals(0, sld1.size());
        sld1.removeLast();
        assertEquals(0, sld1.size());

    }*/

    @Test
    public void testGet() {
        FailureSequence fs = new FailureSequence();
        StudentLinkedListDeque<Integer> sld = new StudentLinkedListDeque<Integer>();
        LinkedListDequeSolution<Integer> ads = new LinkedListDequeSolution<Integer>();

        DequeOperation dequeOp1 = new DequeOperation("isEmpty");
        fs.addOperation(dequeOp1);
        assertEquals(fs.toString(), ads.isEmpty(), sld.isEmpty());

        DequeOperation dequeOp2 = new DequeOperation("addLast", 1);
        fs.addOperation(dequeOp2);
        sld.addLast(1);
        ads.addLast(1);
        assertEquals(fs.toString(), ads.get(0), sld.get(0));

        DequeOperation dequeOp3 = new DequeOperation("addFirst", 0);
        fs.addOperation(dequeOp3);
        sld.addFirst(0);
        ads.addFirst(0);
        assertEquals(fs.toString(), ads.get(0), sld.get(0));

        DequeOperation dequeOp4 = new DequeOperation("addFirst", 2);
        fs.addOperation(dequeOp4);
        sld.addFirst(2);
        ads.addFirst(2);
        assertEquals(fs.toString(), ads.get(0), sld.get(0));

        DequeOperation dequeOp5 = new DequeOperation("get");
        fs.addOperation(dequeOp5);
        assertEquals(fs.toString(), null, sld.get(10));

//        DequeOperation dequeOp4 = new DequeOperation("removeFirst");
//        fs.addOperation(dequeOp4);
//        assertEquals(fs.toString(), ads.removeFirst(), sld.removeFirst());
//
//        DequeOperation dequeOp5 = new DequeOperation("get");
//        fs.addOperation(dequeOp5);
//        assertEquals(fs.toString(), ads.get(1), sld.get(1));
//
//        DequeOperation dequeOp6 = new DequeOperation("removeLast");
//        fs.addOperation(dequeOp6);
//        assertEquals(fs.toString(), ads.removeLast(), sld.removeLast());
//
//        DequeOperation dequeOp7 = new DequeOperation("size");
//        fs.addOperation(dequeOp7);
//        assertEquals(fs.toString(), ads.size(), sld.size());
//
//        DequeOperation dequeOp8 = new DequeOperation("removeFirst");
//        fs.addOperation(dequeOp8);
//        assertEquals(fs.toString(), ads.removeFirst(), sld.removeFirst());

//
//        DequeOperation dequeOp8 = new DequeOperation("removeLast");
//        fs.addOperation(dequeOp8);
//        assertEquals(fs.toString(), ads.removeLast(), sld.removeLast());
//
//        DequeOperation dequeOp9 = new DequeOperation("size");
//        fs.addOperation(dequeOp9);
//        assertEquals(fs.toString(), ads.size(), sld.size());
//
//        DequeOperation dequeOp10 = new DequeOperation("addLast", 1);
//        fs.addOperation(dequeOp10);
//        sld.addLast(1);
//        ads.addLast(1);
//        assertEquals(fs.toString(), ads.get(0), sld.get(0));
//
//        DequeOperation dequeOp11 = new DequeOperation("addFirst", 0);
//        fs.addOperation(dequeOp11);
//        sld.addFirst(0);
//        ads.addFirst(0);
//        assertEquals(fs.toString(), ads.get(0), sld.get(0));
//
//        DequeOperation dequeOp12 = new DequeOperation("getRecursive");
//        fs.addOperation(dequeOp12);
//        assertEquals(fs.toString(), ads.getRecursive(0), sld.getRecursive(0));
//
//        DequeOperation dequeOp13 = new DequeOperation("getRecursive");
//        fs.addOperation(dequeOp13);
//        assertEquals(fs.toString(), ads.getRecursive(1), sld.getRecursive(1));
//
//        DequeOperation dequeOp14 = new DequeOperation("addLast", 2);
//        fs.addOperation(dequeOp14);
//        sld.addLast(2);
//        ads.addLast(2);
//        assertEquals(fs.toString(), ads.getRecursive(2), sld.getRecursive(2));
//
//        DequeOperation dequeOp15 = new DequeOperation("addLast", 3);
//        fs.addOperation(dequeOp15);
//        sld.addLast(3);
//        ads.addLast(3);
//        assertEquals(fs.toString(), ads.getRecursive(3), sld.getRecursive(3));
//
//        DequeOperation dequeOp16 = new DequeOperation("addLast", 4);
//        fs.addOperation(dequeOp16);
//        sld.addLast(4);
//        ads.addLast(4);
//        assertEquals(fs.toString(), ads.getRecursive(4), sld.getRecursive(4));
//
//        DequeOperation dequeOp17 = new DequeOperation("addLast", 5);
//        fs.addOperation(dequeOp17);
//        sld.addLast(5);
//        ads.addLast(5);
//        assertEquals(fs.toString(), ads.getRecursive(5), sld.get(5));
//
//        DequeOperation dequeOp18 = new DequeOperation("addLast", 6);
//        fs.addOperation(dequeOp18);
//        sld.addLast(6);
//        ads.addLast(6);
//        assertEquals(fs.toString(), ads.get(6), sld.getRecursive(6));
    }
}
