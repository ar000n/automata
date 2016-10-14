import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestDataParser {
    private String textFile;

    public TestDataParser(String fileName) {
        this.textFile = fileName;
    }

    public String read() throws IOException {
        BufferedReader file = new BufferedReader(new FileReader(this.textFile));
        return file.readLine();
    }

    public static void main(String[] args) throws IOException {
        TestDataParser testDataParser = new TestDataParser("src/examples.json");
        String result[] =  testDataParser.read().split("]},\\{");
        for (int i = 0; i <1 ; i++) {

        System.out.printf(result[i]);
        }
    }

}
