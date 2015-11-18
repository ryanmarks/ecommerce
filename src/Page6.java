import java.io.PrintStream;
import java.util.Scanner;

public class Page6
        extends Page
{
    Page6(UserService userService)
    {
        super(userService);
    }

    public int getPageNo()
    {
        return 6;
    }

    public int render()
    {
        Scanner sc = new Scanner(System.in);
        String opt;
        do
        {
            System.out.println("1.Readables");
            System.out.println("2.Audio");
            System.out.print("Choose your option:");

            opt = sc.next();
        } while ((!opt.equals("-1")) && (!opt.equals("1")) && (!opt.equals("2")));
        switch (opt)
        {
            case "-1":
                return 5;
            case "1":
                return 8;
            case "2":
                return 9;
        }
        throw new RuntimeException("Logic error in page 6");
    }
}
