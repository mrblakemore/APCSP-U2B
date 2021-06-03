public class ConvertInches
{
    private int inches;
    
    public ConvertInches(int aInches)
    {
        inches = aInches;
    }
    
    public int getInches()
    {
        return inches;
    }
    
    public void setInches(int aInches)
    {
        inches = aInches;
    }
    
    public double convertToFeet()
    {
        return inches / 12.0;
    }
    
    public double convertToYards()
    {
        return convertToFeet() / 3.0;
    }
    
    public String toString()
    {
        String output = "Inches: " + getInches() + ", Feet: " +
            convertToFeet() + ", Yards: " + convertToYards();
            return output;
    }
}
