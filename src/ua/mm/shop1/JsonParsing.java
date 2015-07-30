package ua.mm.shop1;

/**
 * Created by Maxim on 30.07.2015.
 */

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParsing {
    // public static List<List<String>> list= new ArrayList<>();
    public static ArrayList<String[]> parsedJson = new ArrayList<>();

    public static void jsonParser (String pathToFile) throws JSONException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathToFile));
        String [] parsedText = new String[7];
        String result = " ";
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line!=null){
            sb.append(line);
            line=br.readLine();
        }
        result = sb.toString();
        JSONObject obj= new JSONObject(result);

        System.out.println(""+obj.getJSONObject("orderInfo").getString("orderId")+"\n");

        JSONArray arr = (JSONArray)((JSONObject)obj.get("orderInfo")).get("items");
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
            for(int c = 0; c<parsedText.length; c++){
                System.out.println(parsedText[c]);
            }
            System.out.println("Size"+parsedJson.size());
            parsedJson.add(parsedText);
            System.out.println("Size" + parsedJson.size());
            String sdsds[]=parsedJson.get(0);
            System.out.println(sdsds[1]);
            System.out.println("---------------\n"+parsedJson.size());
        }
    }
}
