import java.io.*;
import java.nio.charset.Charset;

public class Page11 extends Page {

    Page11(UserService userService, ItemService itemService) {
        super(userService, itemService);
    }

    @Override
    public int getPageNo() {
        return 11;
    }

    @Override
    public int render() {
        String line;
        try (
                InputStream fis = new FileInputStream("ItemsBought.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
        }
        return 5;// Goto 5 the main page
    }
}