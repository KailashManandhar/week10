package week10;


/**
 * Write a description of class normal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class premium extends order
{
    public premium(int id, int amount, String name)
    {
        super(id,amount,name);
    }
    
    @Override
    public int amount()
    {
        return super.amount() + 150;
    }
    
    
}