package week10;


/**
 * Write a description of class saving here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class current extends account
{
    public current(int acc, int bal, String name)
    {
        super(acc,bal,name);
    }
    
    @Override
    public int interest()
    {
        return super.interest() + 3000;
    }
    
    public int interest(int rate)
    {
        return interest() * rate;
    }
}