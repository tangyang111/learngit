package cn.zju.ty.test3;

/**
 * Created by ty on 2017/4/28.
 */
public class ImTest<Item> extends Father<Item> implements InTest<Item> {

    @Override
    public void doSome1() {

    }

    @Override
    public void doSome2(Item i) {

    }

    @Override
    public Item doSome3() {
        return null;
    }

    @Override
    public Item doSome4(Item i) {
        return null;
    }
}
