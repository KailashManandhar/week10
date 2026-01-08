package week10;


/**
 * Write a description of class nurse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class nurse extends person
{
    private String shift;
    private int allowance;
    
    public nurse(int id, String name, String shi, int all)
    {
        super(id, name);
        this.shift = shi;
        this.allowance = all;
    }
    
    @Override
    public int calcSalary()
    {
        return super.calcSalary() + this.allowance;
    }
}