package week10;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends person
{
    private String special;
    private int fee;
    
    public doctor(int id, String name, String spec, int f)
    {
        super(id,name);
        this.special = spec;
        this.fee = f;
    }
    
    @Override
    public int calcSalary()
    {
        return fee + super.calcSalary();
    }
    
    public int calcSalary(int emergency)
    {
        return calcSalary() + emergency;
    }
}