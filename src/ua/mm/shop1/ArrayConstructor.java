package ua.mm.shop1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConstructor {
    public static ArrayList<String[]> constructed;
    public static ArrayList<String[]> arrayListConstructor(String strings[]){
        ArrayList<String[]> stringsArrayList = new ArrayList<>();
        for(int i =0; i<strings.length; i++){
            stringsArrayList.add(strings);
        }
        System.out.println(Arrays.toString(strings));
        constructed = stringsArrayList;
        return stringsArrayList;
    }
    public static String[] getConstructed(int i) {
        System.out.println(Arrays.toString(constructed.get(i)));
        return constructed.get(i);
    }
}
