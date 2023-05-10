import java.io.*;
import SY.*;
import TY.*;

class Student
{
    int rno;
    String name;
    SYMarks sob;
    TYMarks tob;

    Student(int r,String n,SYMarks obs,TYMarks obt)
    {
        rno=r;
        name=n;
        sob=obs;
        tob=obt;
    }

    String Grade(double avg)
    {
        if(avg>=70)
            return "A";
        else if(avg>=60 && avg<70)
            return "B";
        else if(avg>=50 && avg<60)
            return "c";
        else if(avg>=40 && avg<50)
            return "PASS";
        else
            return "FAIL";
    }


    void result()
    {
        System.out.println(rno+"\t"+name);
        sob.show();
        tob.show();
        double totalm = sob.compT+sob.electT+sob.mathsT+tob.practical+tob.theory;
        double avg = totalm/5;
        
        String grade = Grade(avg);

        System.out.println("Grade of Stident is :"+grade);
    }

}


public class StudentDemo {

    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter how many students");
        int n = Integer.parseInt(br.readLine());

        Student s[] = new Student[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter roll no:");
            int rno = Integer.parseInt(br.readLine());
            System.out.println("Enter name");
            String name = br.readLine();
            System.out.println("Enter comp marks");
            double comp = Double.parseDouble(br.readLine());
            System.out.println("Enter maths marks");
            double math = Double.parseDouble(br.readLine());
            System.out.println("Enter maths electric");
            double elect = Double.parseDouble(br.readLine());
            System.out.println("Enter thory marks");
            double theory = Double.parseDouble(br.readLine());
            System.out.println("Enter maths practical");
            double practical = Double.parseDouble(br.readLine());

            SYMarks sob = new SYMarks(comp, math, elect);
            TYMarks tob = new TYMarks(theory, practical);

            s[i] = new Student(rno, name, sob, tob);
            

            
            
        }

        System.out.println("%%%%%Result*******");

            for(int i=0;i<n;i++)
            {
                s[i].result();
            }
    }
    
}
