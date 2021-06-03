public class ConvertMiles
{
    private int miles;
    
    public ConvertMiles(int aMiles)
    {
        miles = aMiles;
    }
    
    public int getMiles()
    {
        return miles;
    }
    
    public void setMiles(int aMiles)
    {
        miles = aMiles;
    }
    
    public double convertToKilometers()
    {
        double output = miles * 1.60934;
        return output;
    }
    
    public String toString()
    {
        String output = "Miles: " + getMiles() + 
            ", Kilos: " + convertToKilometers();
        return output;
    }
}