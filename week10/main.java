package week10;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args)
    {
        doctor d = new doctor(1,"ram", "md",150);
        nurse n = new nurse(2,"sita", "day", 100);
        System.out.println(d);
        System.out.println(n);
        
        bike b = new bike(1,"honda",100,10);
        car c = new car(2,"suzuki",200,50);
        
        System.out.println(b);
        System.out.println(c);
        
        science s = new science(1,22,"ram");
        management m = new management(2,21,"hari");
        
        System.out.println(s);
        System.out.println(m);
        
        saving sa = new saving(1,1000,"kailash");
        current cr = new current(2,2000, "hari");
        
        
        System.out.println(sa);
        System.out.println(cr);
        
        normal no = new normal(1,1000,"hari");
        premium p = new premium(2,2000,"shya");
        
        System.out.println(no);
        System.out.println(p);
        
    }
}