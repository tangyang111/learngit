import java.awt.dnd.DnDConstants;

/**
 * Created by ty on 2017/4/10.
 */
public class LinkedListDeque<Item> {
    private DNode sentinel;
    private int size;

    private class DNode {
        private Item item = null;
        private DNode next = null;
        private DNode prev = null;
        public DNode(Item i, DNode p, DNode n){
            item = i;
            prev = p;
            next = n;
        }
    }

    public LinkedListDeque() {
        size = 0;
        DNode sen = new DNode(null, null, null);
        sentinel = sen;
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }

    public void addZero(DNode node){
        sentinel.next = node;
        sentinel.prev = node;
        node.next = sentinel;
        node.prev = sentinel;
    }

    public void addFirst(Item i){
        DNode node = new DNode(i, null, null);
        if(this.size == 0){
            addZero(node);
        }
        else{
            node.next = sentinel.next;
            node.prev = sentinel;
            sentinel.next.prev = node;
            sentinel.next = node;
        }
        size += 1;
    }

    public void addLast(Item i){
        DNode node = new DNode(i, null, null);
        if(this.size == 0){
            addZero(node);
        }
        else{
            node.next = sentinel;
            node.prev = sentinel.prev;
            sentinel.prev.next = node;
            sentinel.prev = node;
        }
        size += 1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public int size(){return size;}

    public void printDeque(){
        DNode pt = sentinel;
        while(pt.next != sentinel){
            System.out.print(pt.next.item.toString() + ' ');
            pt = pt.next;
        }
    }
    public Item removeFirst(){
        if(size == 0){
            return null;
        }
        Item i = sentinel.next.item;
        sentinel.next.next.prev = sentinel;
        sentinel.next = sentinel.next.next;
        size -= 1;
        return i;
    }
    public Item removeLast(){
        if(size == 0){
            return null;
        }
        Item i = sentinel.prev.item;
        sentinel.prev.prev.next = sentinel;
        sentinel.prev = sentinel.prev.prev;
        size -= 1;
        return  i;
    }
    public Item get(int index){
        if(index > size){
            return null;
        }
        else{
            DNode pt = sentinel;
            int count = 0;
            while(count < index){
                count += 1;
                pt = pt.next;
            }
            return pt.item;
        }
    }

    private DNode getDNodeRecursive(int index){
        if(index > size){
            return null;
        }
        else{
            DNode node;
            if(index == 1){
                node = sentinel.next;
            }
            else{
                node = getDNodeRecursive(index - 1).next;
            }
            return node;
        }
    }

    public Item getRecursive(int index){
        DNode node = getDNodeRecursive(index);
        if(node == null){
            return null;
        }
        return node.item;
    }
}
