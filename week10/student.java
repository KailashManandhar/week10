package week10;


/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private int roll, marks;
    private String name;
    public student(int roll, int marks, String name)
    {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }
    public void setroll(int roll)
    {
        this.roll = roll;
    }
    
    public int getroll()
    {
        return this.roll;
    }
    
    public void setmarks(int marks)
    {
        this.marks = marks;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public int getmarks()
    {
        return this.marks;
    }
    
    @Override
    public String toString()
    {
        return roll + "  " + marks + "  " + name;
    }
    
    public String res()
    {
        return "fail";
    }
    
}