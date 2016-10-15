import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestDataParser {
    private static String textFile;

    public TestDataParser(String fileName) {
        this.textFile = fileName;
    }

    public static void main(String[] args) {
        TestDataParser testDataParser = new TestDataParser("src/examples.json");

        try {
            JSONObject json = (JSONObject) new JSONParser().parse(new FileReader(textFile));
            System.out.println(json);

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
