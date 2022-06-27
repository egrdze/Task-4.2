package cs.vsu.ru.lyashenko_e_v;

//{"take"}, {"glove"}, {"herb"}, {"generous"}, {"greet"}, {"ancestor"}, {"dog"}, {"home"}, {"miss"}, {"oil"}, {"conclude"}, {"unit"}
import java.util.Comparator;

public class CombSort {

    public static <T> void sort (T[] input, Comparator<T> comparator) {
        int gap = input.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            if (gap > 1)
                gap = (int) (gap / 1.247330950103979);

            int i = 0;
            swapped = false;
            while (i + gap < input.length) {
                if (comparator.compare(input[i], input[i + gap]) > 0) {
                    T t = input[i];
                    input[i] = input[i + gap];
                    input[i + gap] = t;
                    swapped = true;
                }
                i++;
            }
        }
    }
}












/*
 *
 * 90 08 43 86 89 97 28 34 23 79 66 05 20
 *
 * 10--- 8 ---6---4--3--2--1
 *
 *
 * 05 08 20 23 28 34 43 66 79 86 89 90 97
 *                                   ^  ^
 *
 *
 *
 *
 *
 *
 * */