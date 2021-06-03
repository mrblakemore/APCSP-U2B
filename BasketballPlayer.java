public class BasketballPlayer
{
    private String name;
    private String team;
    private int points;
    private int rebounds;
    
    public BasketballPlayer(String aName, String aTeam)
    {
        name = aName;
        team = aTeam;
        points = 0;
        rebounds = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getTeam()
    {
        return team;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public int getRebounds()
    {
        return rebounds;
    }
    
    public void setPoints(int aPoints)
    {
        points = aPoints;
    }
    
    public void setRebounds(int aRebounds)
    {
        rebounds = aRebounds;
    }
    
    public String toString()
    {
        String output = getName() + " from the " + getTeam() + " scored " +
            getPoints() + " points and had " + getRebounds() + " rebounds.";
        return output;
    }
}
