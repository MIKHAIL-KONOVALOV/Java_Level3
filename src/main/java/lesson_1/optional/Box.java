package lesson_1.optional;

/**
 * @author Mihail
 * Created on 16.06.2020
 */
public class Box {
    private Object obj;

    public Box(Object obj) {
        this.obj = obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void info() {
        System.out.println("obj " + obj);
        System.out.println("type " + obj.getClass());
    }
}
