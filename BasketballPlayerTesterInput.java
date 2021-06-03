import java.util.Scanner;

public class BasketballPlayerTesterInput
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        BasketballPlayer bob = new BasketballPlayer("Tony", "Cyclones");
        
        System.out.println("Enter the points scored:");
        int pts = in.nextInt();
        bob.setPoints(pts);
        
        System.out.println("Enter the rebounds made:");
        int rbs = in.nextInt();
        bob.setRebounds(rbs);
        
        System.out.println(bob.toString());
    }
}
