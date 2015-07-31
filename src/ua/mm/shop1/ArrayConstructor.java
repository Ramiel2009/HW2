package ua.mm.shop1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConstructor {
    public static ArrayList<String[]> constructed = new ArrayList<>();;
    public static ArrayList<String[]> arrayListConstructor(String strings[]){

        constructed.add(strings);
        System.out.println(Arrays.toString(strings));
        return constructed;
    }
    public static String[] getConstructed(int i) {
        System.out.println(Arrays.toString(constructed.get(i)));
        return constructed.get(i);
    }

    public static ArrayList<String[]> getConstructed() {
        return constructed;
    }
}
