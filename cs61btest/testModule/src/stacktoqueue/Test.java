package stacktoqueue;
import java.util.Stack;
/**
 * Created by ty on 2017/5/6.
 */
public class Test<T> {
    private Stack<T> inStack;

    public Test() {
        this.inStack = new Stack<T>();
    }

    public void enQueue(T t) {
        inStack.push(t);
    }

    public T deQueue(){
        return helper(inStack.pop());
    }

    private T helper(T pop) {
        if(inStack.isEmpty()){
            return pop;
        }
        T cur = inStack.pop();
        T temp = helper(cur);
        inStack.push(pop);
        return temp;
    }

    public String toString() {
        String out = "";
        for(T t : inStack){
            out += t.toString();
            out += " ";
        }
        return out;
    }


}
