package cn.zju.ty.discussions.d4;

/**
 * Created by ty on 2017/4/27.
 */
public class Main {
    public static void main(String[] args) {
        Animal a = new Cat("cat1", 10);
        a.greet();
        Animal b = (Animal) new Cat("cat1", 10);
        b.greet();

    }
}
