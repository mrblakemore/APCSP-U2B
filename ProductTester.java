public class ProductTester
{
    public static void main(String[] args)
    {
        
        Product p1 = new Product();        
        System.out.println("Name: " + p1.getName());
        System.out.println("Quantity: " + p1.getQuantity());
        p1.setQuantity(250);
        System.out.println("---------QUANTITY CHANGED-------");
        System.out.println("Name: " + p1.getName());
        System.out.println("Quantity: " + p1.getQuantity());
        
        Product p2 = new Product("Candy Bar", 13, 1.25);        
        System.out.println("Name: " + p2.getName());
        System.out.println("Quantity: " + p2.getQuantity());
        p2.setQuantity(12);
        System.out.println("---------QUANTITY CHANGED-------");
        System.out.println("Name: " + p2.getName());
        System.out.println("Quantity: " + p2.getQuantity());
        
        Product p3 = new Product("Drink", 23, .99);        
        System.out.println("Name: " + p3.getName());
        System.out.println("Quantity: " + p3.getQuantity());
        p3.setQuantity(p3.getQuantity() + 24);
        System.out.println("---------QUANTITY CHANGED-------");
        System.out.println("Name: " + p3.getName());
        System.out.println("Quantity: " + p3.getQuantity());
        
        
    }
    
}
