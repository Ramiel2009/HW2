package ua.mm.shop1;

import org.json.JSONException;
        import java.io.IOException;
        import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        try {
            JsonParsing.jsonParser("/Users/Maxim/order.json");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        for (String[]s: ArrayConstructor.getConstructed()){
            System.out.println(Arrays.toString(s));
            DBConnector.connection(s);
        }
    }
}
