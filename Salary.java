import java.util.*;

public class Salary{

public static void main (String [] args){
Scanner con = new Scanner (System.in);

double tdeduction;
double tsalary;
double ttax;

System.out.print("Enter Monthly Salary: ");
double salary = con.nextDouble();

double ftax =  sssdeduc(salary) + (pdeduc(salary) + pIdeduc(salary));//compute for total deductions
tsalary = (salary- ftax) + ttax(salary);//para ni siya sa taxable salary
               
               
System.out.print("Taxable Monthly Salary: " + String.format("%.2f",tsalary));
//System.out.print("\nPhilHealth: " + String.format("%.2f",pdeduc(salary)));
//System.out.print("\nSSS: " + String.format("%.2f",sssdeduc(salary)));
//System.out.print("\nPag IBig : " + String.format("%.2f",pIdeduc(salary)));
System.out.print("\nTotal Deductions(SSS, Pag-Ibig, Philhealth): " + String.format("%.2f",ftax));
System.out.print("\nWitholding Tax: " + String.format("%.2f",whTax(tsalary)));

double netSalary = tsalary - whTax(tsalary);//ug pila nalang nahabilin sa iya salary
System.out.print("\nNet Monthly Salary:  " + String.format("%.2f",netSalary));

}
public static double pdeduc(double salary){//PhilHealth ni sya dre dapit
      
             if(salary <= 10000 )
                  return 137.50;
             else if (salary > 10000 && salary < 40000)
                  return (salary * 0.0275 ) /2;
             else 
                 return 550;
 
      }
 public static double sssdeduc(double salary){//SSS 
               if (salary < 16000)
                  return salary *0.03633125;
               else
                  return 581.3;
      
      } 
 public static double pIdeduc(double salary){// Pag ibig 
               if(salary < 5000)
                  return 0;
               else
                  return 100;
   
      
      }
  public static double ttax (double salary){// mao ni #2 sa given link
               if(salary > 90000)
                     return (salary-90000)/12; 
                else
                  return 0;       
      }
  public static double whTax(double tsalary){//with holding tax 
               if(tsalary <= 20833)
                    return 0;                                              
               else if(tsalary > 20833 && tsalary <33333)
                    return (tsalary - 20833.33) * 0.20;
               else if (tsalary >= 33333 && tsalary < 66667 )
                    return ((tsalary - 33333) * 0.25) + 2500;                 
               else if (tsalary >= 66667 && tsalary < 166667)
                    return ((tsalary - 66667) * 0.30) + 10833.33;                  
               else if (tsalary >= 166667 && tsalary < 666667)
                    return ((tsalary - 166667) * 0.32) + 40833.33;            
               else 
                    return ((tsalary - 666667) * 0.35 ) + 200833.33;
      }  
}