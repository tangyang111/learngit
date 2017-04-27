package cn.zju.ty.discussions.d4;

/**
 * Created by ty on 2017/4/27.
 */
public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }

    @Override
    public void greet() {
        System.out.println("Cat " + name + " says: " + makeNoise());
    }
}
