public class Product
{
    private String name;
    private int quantity;
    private double price;

    public Product()
    {
        name = "Pencil";
        quantity = 300;
        price = 0.25;
    }
    
    public Product(String aName, int aQuantity, double aPrice)
    {
        name = aName;
        quantity = aQuantity;
        price = aPrice;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
    
    public void setQuantity(int newQuantity)
    {
        quantity = newQuantity;
    }
    
    
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
}
