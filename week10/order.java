package week10;


/**
 * Write a description of class order here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class order
{
    private int id, amount;
    private String name;
    
    public order(int id, int a, String n)
    {
        this.id = id;
        this.amount = amount;
        this.name = name;
    }
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    public void setamount(int amount)
    {
        this.amount = amount;
    }
    
    public int getamount()
    {
        return this.amount;
    }
    
    public void setname(String name)
    {
        this.name = name;
    }
    
    public String getname()
    {
        return this.name;
    }
    
    public int amount()
    {
        return 1000;
    }
    
    
}