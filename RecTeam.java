public class RecTeam
{
    private String city;
    private String mascot;
    private String ages;
    private String color;
    
    public RecTeam()
    {
        city = "Carrollton";
        mascot = "Trojans";
        ages = "9-10";
        color = "gold";        
    }
    
    public RecTeam(String aAges)
    {
        city = "Carrollton";
        mascot = "Trojans";
        ages = aAges;
        color = "gold";        
    }
    
    public RecTeam(String aAges, String aColor)
    {
        city = "Carrollton";
        mascot = "Trojans";
        ages = aAges;
        color = aColor;        
    }
    
    public RecTeam(String aCity, String aMascot, String aAges, String aColor)
    {
        city = aCity;
        mascot = aMascot;
        ages = aAges;
        color = aColor;        
    }
    

    public String toString()
    {
        String output = "";
        output += "City: " + city;
        output += "\nMascot: " + mascot;
        output += "\nAges: " + ages;
        output += "\nColor: " + color;
        return output;
    }
    
}

