/**
 * Created by ty on 2017/4/11.
 */
public class ArrayDeque<Item> {
    private static int FACTOR = 2;
    private static double DFACTOR = 0.2;
    private Item[] items;
    private int size;
    private int nextFirst;
    private int nextLast;
    public ArrayDeque(){
        items = (Item[])new Object[8];
        size = 0;
        nextFirst = 4;
        nextLast = 5;
    }

    private int nextAdd(int i){
        i++;
        if(i == items.length){
            i = 0;
        }
        return i;
    }

    private int nextDec(int i){
        i--;
        if(i == -1){
            i = items.length - 1;
        }
        return i;
    }

    public void sizeUp(){
        Item[] temp = (Item[]) new Object[items.length * FACTOR];
        if(nextFirst < nextLast){
            System.arraycopy(items, 0, temp, 0, size);
        }
        else{
            System.arraycopy(items, nextFirst, temp, 0, items.length - nextFirst);
            System.arraycopy(items, 0, temp, items.length - nextFirst, nextFirst);
        }
        this.nextLast = items.length - 1;
        this.nextFirst = 0;
        this.items = temp;
    }

    public void sizeDown(){
        Item[] temp = (Item[]) new Object[(int)(items.length * DFACTOR)];
        if(nextFirst < nextLast){
            System.arraycopy(items, nextFirst, temp, 0, nextLast - nextFirst + 1);
        }else{
            System.arraycopy(items, nextFirst, temp, 0, items.length - nextFirst);
            System.arraycopy(items, 0, temp, items.length - nextFirst, nextLast + 1);
        }
        this.nextLast = this.size + 1;
        this.nextFirst = 0;
        this.items = temp;
    }

    public void addFirst(Item i){
        if(size == items.length - 2){
            this.sizeUp();
        }
        items[nextFirst] = i;
        nextFirst = nextDec(nextFirst);
        size += 1;
    }

    public void addLast(Item i){
        if(size == items.length - 2){
            this.sizeUp();
        }
        items[nextLast] = i;
        nextLast = nextAdd(nextLast);
        size += 1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        int pt = nextAdd(nextFirst);
        while(pt != nextLast){
            System.out.print(items[pt]);
            System.out.print(" ");
            pt = nextAdd(pt);
        }
    }

    public Item removeFirst(){
        if(nextAdd(nextFirst) == nextLast){
            return null;
        }
        if(size < items.length/FACTOR/5){
            this.sizeDown();
        }
        nextFirst = nextAdd(nextFirst);
        Item res = items[nextFirst];
        items[nextFirst] = null;
        size--;
        return res;
    }

    public Item removeLast(){
        if(nextAdd(nextFirst) == nextLast){
            return null;
        }
        if(size < items.length/FACTOR/5){
            this.sizeDown();
        }
        nextLast = nextDec(nextLast);
        Item res = items[nextLast];
        items[nextLast] = null;
        size--;
        return res;
    }

    public Item get(int index){
        if(index > size){
            return null;
        }
        int num = index + nextFirst;
        if(num > items.length - 1){
            num = num - items.length;
        }
        return items[num];
    }
}
