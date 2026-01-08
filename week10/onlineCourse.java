package week10;


/**
 * Write a description of class onlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class onlineCourse extends course
{
    private double platformFee;
    
    public onlineCourse(int id, String course, double basePrice, double fee)
    {
         super(id,course,basePrice);
         this.platformFee = fee;
    }
    
    @Override
    public double getcalculateFee()
    {
        return getcalculateFee() + platformFee;
    }
    
}