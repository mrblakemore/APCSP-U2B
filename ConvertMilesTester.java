import java.util.Scanner;

public class ConvertMilesTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of Miles:");
        int input = in.nextInt();
        
        ConvertMiles test = new ConvertMiles(input);
        System.out.println(test.toString());
    }
}
