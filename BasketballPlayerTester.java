public class BasketballPlayerTester
{
    public static void main(String[] args)
    {
        BasketballPlayer bob = new BasketballPlayer("Tony", "Cyclones");
        bob.setPoints(12);
        bob.setRebounds(11);
        System.out.println(bob.toString());
    }
}
