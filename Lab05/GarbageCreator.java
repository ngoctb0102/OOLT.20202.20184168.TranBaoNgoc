import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String s = "";
        BufferedReader br = null;

        try {   
            br = new BufferedReader(new FileReader("test.txt"));       
            while (br.readLine() != null) {
                s = s + br.readLine();
            }
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
