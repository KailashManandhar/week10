package week10;


/**
 * Write a description of class account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class account
{
    private int acc, bal;
    private String name;
    
    public account(int a, int bal, String n)
    {
        this.acc = a;
        this.bal = bal;
        this.name = n;
    }
    
    public void setacc(int acc)
    {
        this.acc = acc;
    }
    
    public int getacc()
    {
        return this.acc;
    }
    
    public void setbal(int bal)
    {
        this.bal = bal;
    }
    
    public int getbal()
    {
        return this.bal;
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
        return name+acc+bal;
    }
    
    public int interest()
    {
        return 1000;
    }
}