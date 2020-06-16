package lesson_1.optional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mihail
 * Created on 16.06.2020
 */
public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(1);
//        Box box2 = new Box("abc");

//        BoxUltimate<Integer> box1 = new BoxUltimate<>(1);
//        BoxUltimate<String> box2 = new BoxUltimate<>("One");
//
//        box1.info();
//        box2.info();

//        TwoGenerics<Integer,String> twoGenerics = new TwoGenerics<>(555,"Two");
//        twoGenerics.showType();

//        Map<Integer,String> map = new HashMap<>();


        Integer[] inums = {10,20,30};
        Stats<Integer> iob = new Stats<>(inums);
        double res1 = iob.avg();
        System.out.println("res1 = " + res1);

        Double[] dnums = {1.0,2.0,3.0,4.0,5.0};
        Stats<Double> dob = new Stats<>(dnums);
        double res2 = dob.avg();

        System.out.println(res1 + " " + res2);

        if (iob.sameAvg(dob)) {
            System.out.println("Average values are equals");
        } else
            System.out.println("Average values aren't equals");
    }
}
