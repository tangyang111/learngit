package cn.zju.ty.test4;

/**
 * Created by ty on 2017/4/29.
 */
public class Test {
    public static void main(String[] args){
        Integer[] i = new Integer[2];
        i[0] = 1;
        i[0 + 1] = 2;
        doSome(1+2);

    }

    public static void doSome(int i){
        System.out.println(i);
    }
}
