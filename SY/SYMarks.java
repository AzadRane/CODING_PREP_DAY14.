package SY;

public class SYMarks
{
    public double compT,mathsT ,electT;

    public SYMarks(double c,double m,double e)
    {
        compT=c;
        mathsT=m;
        electT=e;
    }

    public void show()
    {
        System.out.println("Comp Marks\tMaths Marks\tElectronics Marks");
        System.out.println(compT+"\t"+mathsT+"\t"+electT);
    }
}