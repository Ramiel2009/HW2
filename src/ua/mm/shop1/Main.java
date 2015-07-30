package ua.mm.shop1;

import org.json.JSONException;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        try {
            JsonParsing.jsonParser("d:/order.json");
        } catch (JSONException e) {
            e.printStackTrace();
        }
            ArrayConstructor.getConstructed(0); // 0,1,2 returns the same result!

    }
}
