package ua.mm.shop1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonGetter {
    public static String reader(String pathToFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathToFile));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line!=null){
            sb.append(line);
            line=br.readLine();
        }
        String result = sb.toString();
        return result;
    }
}
