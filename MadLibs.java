public class MadLibs
{
    private String sport;
    private String friend;
    private String color;
    
    public MadLibs(String aSport, String aFriend, String aColor)
    {
        sport = aSport;
        friend = aFriend;
        color = aColor;
    }
    
    public String toString()
    {
        String sentence1 = "Yesterday, I was playing " + sport + 
            " with my best friend, " + friend + ". \n";
        String sentence2 = "By the time we were done, " + friend + 
            "\'s face was so " + color.toUpperCase() + ".\n ";
        return sentence1 + sentence2;
    }
    
}


