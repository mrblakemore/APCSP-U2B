import java.util.Scanner;

public class MadLibsInputTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a sport:");
        String sportIn = in.nextLine();
        
        System.out.println("Enter a friend's name:");
        String nameIn = in.nextLine();
        
        System.out.println("Enter a color:");
        String colorIn = in.nextLine();
        
        MadLibs first = new MadLibs(sportIn, nameIn, colorIn);
        System.out.println(first.toString());
    }
    
}
