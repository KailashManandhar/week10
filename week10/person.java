package week10;


/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class person
{
    private int id;
    private String name;
    
    public person(int i, String n)
    {
        this.id = i;
        this.name = n;
    }
    
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    @Override
    public String toString()
    {
        return "person details --> person id: " + getid() + " name: " + getname();
    }
    
    
    public int calcSalary()
    {
        return 100000;
    }
    
    
    
}