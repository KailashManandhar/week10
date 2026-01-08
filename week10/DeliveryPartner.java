package week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int pay, id;
    private String name;
    
    public DeliveryPartner(int i, String nm, int p)
    {
        this.id = i;
        this.name = nm;
        this.pay = p;
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
    
    public void setpay(int pay)
    {
        this.pay = pay;
    }
    
    public int getpay()
    {
        return this.pay;
    }
    
    @Override
    public String toString()
    {
        return "id: " + id + " name "+name + "  pay: " + pay;
    }
    
    public int payment()
    {
        return 100;
    }
    
    
    
    
}