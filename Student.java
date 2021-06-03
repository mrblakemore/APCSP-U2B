public class Student
{
    private String name;
    private int id;

    public Student()
    {
        name = "Bob";
        id = 1001;
    }
    
    public Student(String aName, int aId)
    {
        name = aName;
        id = aId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int newId)
    {
        id = newId;
    }
    
    public void setName(String newName)
    {
        name = newName;
    }
}
