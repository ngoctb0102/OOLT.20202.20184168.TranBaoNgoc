import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;

        try {   
            br = new BufferedReader(new FileReader("test.txt"));       
            while (br.readLine() != null) {
                sb.append(br.readLine());
            }
            System.out.println(sb);
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
