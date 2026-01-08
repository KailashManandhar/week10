package week10;


/**
 * Write a description of class offlineCourse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class offlineCourse extends course
{
    private double labFee;
    
    public offlineCourse(int id, String course, double basePrice, double labFee)
    {
        super(id,course,basePrice);
        this.labFee = labFee;
    }
    
    @Override
    public double getcalculateFee()
    {
        return labFee + getcalculateFee();
    }
}