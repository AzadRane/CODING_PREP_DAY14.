package TY;

public class TYMarks {
    
    public double theory,practical;
    
    public TYMarks(double t,double p)
    {
        theory=t;
        practical=p;
    }

    public void show()
    {
        System.out.println("Theory Marks\tPractical marks");
        System.out.println(theory+"\t"+practical);
    }
    
}
