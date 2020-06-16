package lesson_1.optional;

/**
 * @author Mihail
 * Created on 16.06.2020
 */
public class TwoGenerics<T,V> {
    private T obj1;
    private V obj2;

    public TwoGenerics(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }

    public void showType() {
        System.out.println("Type T : " + obj1.getClass().getName());
        System.out.println("Type V : " + obj2.getClass().getName());
    }
}
