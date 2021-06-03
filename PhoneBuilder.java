public class PhoneBuilder
{
    private String maker;
    private String model;
    private String color;
    private int storage;
    
    public PhoneBuilder()
    {
        maker = "Apple";
        model = "iPhone 11";
        color = "black";
        storage = 32;
    }   

    //add code here

    public PhoneBuilder(int aStorage)
    {
        maker = "Apple";
        model = "iPhone 11";
        color = "black";
        storage = aStorage;
    } 
    
    public PhoneBuilder(String aColor, int aStorage)
    {
        maker = "Apple";
        model = "iPhone 11";
        color = aColor;
        storage = aStorage;
    } 
    
    public PhoneBuilder(String aColor, int aStorage, String aMaker, String aModel)
    {
        maker = aMaker;
        model = aModel;
        color = aColor;
        storage = aStorage;
    } 

    public String toString()
    {
        String output = "";
        output += "Maker: " + maker;
        output += "\nModel: " + model;
        output += "\nColor: " + color;
        output += "\nStorage: " + storage;
        return output;
    }
}
