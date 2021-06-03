public class StudentTester
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Tony", 2345);
        
        System.out.println("Student 1's name is " + s1.getName());
        System.out.println("Student 1's ID is " + s1.getId());
        
        System.out.println("Student 2's name is " + s2.getName());
        System.out.println("Student 2's ID is " + s2.getId());
        
        s1.setName("Robert");
        System.out.println("Student 1's new name is " + s1.getName());
        
        
    }
}

