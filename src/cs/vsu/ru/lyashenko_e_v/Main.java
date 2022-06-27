package cs.vsu.ru.lyashenko_e_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.ROOT);

        MyComparator mc = new MyComparator();

        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        String origarr[] = new String[size];
        System.out.println("Enter the words in English separated by a space:");
        for (int i = 0; i < size; i++) {
            origarr [i] = scan.next();
        }
        int j = 0;

        CombSort.sort(origarr, mc);
        for (int i = 0; i < size; i++){
            System.out.println(origarr[i]);
        }




    }
}