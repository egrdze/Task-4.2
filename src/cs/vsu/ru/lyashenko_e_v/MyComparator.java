package cs.vsu.ru.lyashenko_e_v;
import java.util.Comparator;

public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int kolvo1 = kolvo(s1);
        int kolvo2 = kolvo(s2);
        if (kolvo1 == kolvo2) {
            return s2.length() - s1.length();
        }
        return kolvo2 - kolvo1;
    }

    public int kolvo(String str) {
        int counter = 0;
        char[] vowels = new char[] {'a', 'e', 'y', 'u', 'i', 'o'};
        char[] s = str.toCharArray();
        for (char i:s) {
            for (char j:vowels) {
                if(i == j) {
                    counter++;
                }
            }
        }
        return counter;
    }
}