package cn.zju.ty.test1;

/**
 * Created by ty on 2017/5/21.
 */


public class Cat extends Animal {
    public Cat(int i) {
        this.i = i;
    }
    protected void printi() {
        System.out.println(i);
    }
}
