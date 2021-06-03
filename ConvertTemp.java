public class ConvertTemp
{
    private int temp;
    
    public ConvertTemp(int aTemp)
    {
        temp = aTemp;
    }
    
    public int getTemp()
    {
        return temp;
    }
    
    public void setTemp(int aTemp)
    {
        temp = aTemp;
    }
    
    public double convertToCelsius()
    {
        return (temp - 32) / 1.8;
    }
    
    public double convertToKelvin()
    {
        return convertToCelsius() + 273.15;
    }
    
    public String toString()
    {
        String output = "Temp: " + getTemp() + ", Celsius: " +
            convertToCelsius() + ", Kelvin: " + convertToKelvin();
            return output;
    }
}
