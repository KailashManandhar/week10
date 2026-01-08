package week10;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends DeliveryPartner
{
    private int bike;
    
    public bike(int id, String name, int pay, int bike)
    {
        super(id,name,pay);
        this.bike = bike;
    }
    
    @Override
    public int payment()
    {
        return bike + super.payment();
    }
    
    public int payment(int extra)
    {
        return payment() + extra;
    }
}