package lesson_1.optional;

/**
 * @author Mihail
 * Created on 16.06.2020
 */
public class Stats<T extends Number > {

    private T[] num;

    public Stats(T[] num) {
        this.num = num;
    }

    public double avg() {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }
        return sum / num.length;
    }

    public boolean sameAvg(Stats<? super Double> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }
}
