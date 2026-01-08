package week10;


/**
 * Write a description of class normal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class normal extends order
{
    public normal(int id, int amount, String name)
    {
        super(id,amount,name);
    }
    
    @Override
    public int amount()
    {
        return super.amount() + 100;
    }
    
    public int amount(int dis)
    {
        return amount() + dis;
    }
}