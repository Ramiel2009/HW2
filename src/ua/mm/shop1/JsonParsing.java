package ua.mm.shop1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class JsonParsing {
    public static void jsonParser (String pathToFile) throws JSONException, IOException {

        String [] parsedText = new String[7]; //array for json item

        JSONObject obj= new JSONObject(JsonReaderr.reader(pathToFile)); //read .json
        JSONArray arr = obj.getJSONObject("orderInfo").getJSONArray("items");

        for(int i =0; i<arr.length(); i++ ){

            int itemId = arr.getJSONObject(i).getInt ("itemId");
            String title = arr.getJSONObject(i).getString("title");
            String authorName = arr.getJSONObject(i).getString("authorName");
            int releaseYear = arr.getJSONObject(i).getInt("releaseYear");
            String orderDate = arr.getJSONObject(i).getString("orderDate");
            String customerName = arr.getJSONObject(i).getString("customerName");
            String customerPhone = arr.getJSONObject(i).getString("customerPhone");

            parsedText[0]= String.valueOf(itemId);
            parsedText[1]= title;
            parsedText[2]= authorName;
            parsedText[3]= String.valueOf(releaseYear);
            parsedText[4]= orderDate;
            parsedText[5]= customerName;
            parsedText[6]= customerPhone;

            ArrayConstructor.arrayListConstructor(parsedText);
        }
    }
}
