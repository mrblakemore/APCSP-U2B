import java.util.Scanner;

public class ConvertTempTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Fahrenheit:");
        int input = in.nextInt();
        
        ConvertTemp test = new ConvertTemp(input);
        System.out.println(test.toString());
    }
}
