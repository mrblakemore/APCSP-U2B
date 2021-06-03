public class RecTeamTester
{
    public static void main(String[] args)
    {
        System.out.println("\nTeam Example #1: ");
        //EXPECTED: City: Carrollton, Mascot: Trojans, Ages: 9-10, Color: Gold
        RecTeam team1 = new RecTeam();
        System.out.println(team1.toString());
        
        System.out.println("\nTeam Example #2: ");
        //EXPECTED: City: Carrollton, Mascot: Trojans, Ages: 11-12, Color: Gold
        RecTeam team2 = new RecTeam();
        System.out.println(team2.toString());
        
        System.out.println("\nTeam Example #3: ");
        //EXPECTED: City: Carrollton, Mascot: Trojans, Ages: 11-12, Color: Black
        RecTeam team3 = new RecTeam();
        System.out.println(team3.toString());
        
        System.out.println("\nTeam Example #4: ");
        //EXPECTED: City: Temple, Mascot: Tigers, Ages: 11-12, Color: Yellow
        RecTeam team4 = new RecTeam();
        System.out.println(team4.toString());
        
        System.out.println("\nTeam Example #5: ");
        //EXPECTED: City: Bowdon, Mascot: Red Devils, Ages: 11-12, Color: Red
        RecTeam team5 = new RecTeam();
        System.out.println(team5.toString());

        System.out.println("\nTeam Example #6: ");
        //EXPECTED: City: Bremen, Mascot: Blue Devils, Ages: 11-12, Color: Blue
        RecTeam team6 = new RecTeam();
        System.out.println(team6.toString());     
    }   
}
