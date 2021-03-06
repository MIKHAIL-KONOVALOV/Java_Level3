package lesson_1.optional;

/**
 * @author Mihail
 * Created on 16.06.2020
 */
public class BoxUltimate<T> {
    private T obj;

    public BoxUltimate(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void info() {
        System.out.println("obj " + obj);
        System.out.println("type " + obj.getClass());
    }
}
