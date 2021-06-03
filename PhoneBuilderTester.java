public class PhoneBuilderTester
{
    public static void main(String[] args)
    {
        System.out.println("\nDefault Constructor Example: ");
        PhoneBuilder phone1 = new PhoneBuilder();
        System.out.println(phone1.toString());
        
        System.out.println("\nConstructor #3 Example: ");
        PhoneBuilder phone2 = new PhoneBuilder("Red", 250);
        System.out.println(phone2.toString());
        
        System.out.println("\nConstructor #4 Example: ");
        
        PhoneBuilder phone3 = new PhoneBuilder("Black", 64, "Samsung", "Galaxy S20");
        System.out.println(phone1.toString());
    }  
}
