import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashSet<String> article = new HashSet<>();

        for(;;)
        {
            System.out.println("Положить в аптечку: ");
            String command = reader.readLine().trim();
            if(command.equals("LIST"))
            {
                for(String names : article)
                {
                    System.out.println(names);
                }
            }
            else
            {
                article.add(command);
            }
        }
    }
}
