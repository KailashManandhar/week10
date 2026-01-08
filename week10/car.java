package week10;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends DeliveryPartner
{
    private int car;
    
    public car(int id, String name, int pay, int car)
    {
        super(id,name,pay);
        this.car = car;
    }
    
    @Override
    public int payment()
    {
        return car + super.payment();
    }
}