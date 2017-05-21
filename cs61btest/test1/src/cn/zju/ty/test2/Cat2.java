package cn.zju.ty.test2;

import cn.zju.ty.test1.Cat;

/**
 * Created by ty on 2017/5/21.
 */
public class Cat2 extends Cat {

    public Cat2(int i) {
        super(i);
        /*虽然Cat2类中没有成员变量i，但是父类Cat中有，因此Cat2中依然可以调用父类中的构造方法
        * 来初始化父类中的i*/
    }

/*    public void doSome() {
            System.out.println(super.i);
        }*/
        
    public static void main(String[] args) {
        Cat2 c = new Cat2(10);
        c.printi();
    }
    /*虽然Cat2不继承变量i，但是继承了父类Cat中能访问变量i的方法，
    * 因此如果不重写该方法，即可调用该方法访问父类中私有的变量i*/
}
