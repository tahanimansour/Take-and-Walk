
package takeandwalk;

public class Employee
{
    private String name;
    private int age;
    private final String id = "TW1234@@##$$;";

    public Employee() 
    {
        
    }

    
    public Employee(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() 
    {
        return id;
    }  
}
