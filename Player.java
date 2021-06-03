public class Player
{
    private String name;
    private String team;
    
    public Player(String aName, String aTeam)
    {
        name = aName;
        team = aTeam;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getTeam()
    {
        return team;
    }
    
    public void setTeam(String newTeam)
    {
        team = newTeam;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
        
    public String toString()
    {
        String output = getName() + " plays for the " + getTeam();
        return output;
    }
}
