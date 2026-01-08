package week10;


/**
 * Write a description of class course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class course
{
    private int id;
    private String course;
    private double basePrice;
    
    
    public course(int id, String nm, double price)
    {
        this.id= id;
        this.course = nm;
        this.basePrice = price;
    }
    
    public void setid(int New_id)
    {
        this.id = New_id;
    }
    
    public int getid()
    {
        return this.id;
    }
    
    public void setcourse(String new_course)
    {
        this.course = new_course;
    }
    
    public String getcourse()
    {
        return this.course;
    }
    
    public void setbasePrice(double New_price)
    {
        this.basePrice = New_price;
    }
    
    public double getcalculateFee()
    {
        return this.basePrice;
    }
    
    
    onlineCourse o = new onlineCourse(1,"computing", 20000, 2000);
    offlineCourse f = new offlineCourse(2,"computing", 20000, 1500);
    
    
    System.out.println(o.getcalculateFee());
    
    
}