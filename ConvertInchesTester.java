import java.util.Scanner;

public class ConvertInchesTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of Inches:");
        int input = in.nextInt();
        
        ConvertInches test = new ConvertInches(input);
        System.out.println(test.toString());
    }
}
