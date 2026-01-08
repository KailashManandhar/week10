package week10;


/**
 * Write a description of class saving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class saving extends account
{
    public saving(int acc, int bal, String name)
    {
        super(acc,bal,name);
    }
    
    @Override
    public int interest()
    {
        return super.interest() + 1000;
    }
    
    public int interest(int rate)
    {
        return interest() * rate;
    }
}