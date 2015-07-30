package ua.mm.shop1;

import org.json.JSONException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Maxim on 30.07.2015.
 */


public class Main {
    public static void main(String args[]) throws IOException {
        try {
            JsonParsing.jsonParser("d:/order.json");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        for(int i=0; i<JsonParsing.parsedJson.size(); i++){
            String temp[] = JsonParsing.parsedJson.get(i);
            System.out.println("Array: "+Arrays.toString(temp));
            for(int a=0; a<temp.length; a++){
                //System.out.println("sdsdsdsd:"+temp[a]);

            }
        }
    }
}
